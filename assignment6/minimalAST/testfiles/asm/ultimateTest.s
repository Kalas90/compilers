.global _start
.data
buf: .skip 1024
.text
_start:
	call main
	movq $0, %rdi
	movq $60, %rax
	syscall
gcd1:
	pushq %rbp
	movq %rsp, %rbp
	subq $0, %rsp
gcd1_0_begin:
	movq 16(%rbp), %rax
        pushq %rax
	movq 24(%rbp), %rax
        movq %rax, %rbx
        popq %rax
	cmp %rbx, %rax
	je gcd1_0_end
	movq 16(%rbp), %rax
        pushq %rax
	movq 24(%rbp), %rax
        movq %rax, %rbx
        popq %rax
	cmp %rbx, %rax
	jle gcd1_0_0_else
gcd1_0_0_then:
	movq 16(%rbp), %rax
        pushq %rax
	movq 24(%rbp), %rax
        movq %rax, %rbx
        popq %rax
	subq %rbx, %rax
	movq %rax, 16(%rbp)
	jmp gcd1_0_0_end
gcd1_0_0_else:
	movq 24(%rbp), %rax
        pushq %rax
	movq 16(%rbp), %rax
        movq %rax, %rbx
        popq %rax
	subq %rbx, %rax
	movq %rax, 24(%rbp)
gcd1_0_0_end:
	jmp gcd1_0_begin
gcd1_0_end:
	movq 16(%rbp), %rax
	movq %rbp, %rsp
	popq %rbp
	ret
gcd2:
	pushq %rbp
	movq %rsp, %rbp
	subq $0, %rsp
	movq 24(%rbp), %rax
        pushq %rax
	movq $0, %rax
        movq %rax, %rbx
        popq %rax
	cmp %rbx, %rax
	jne gcd2_0_else
gcd2_0_then:
	movq 16(%rbp), %rax
	movq %rbp, %rsp
	popq %rbp
	ret
	jmp gcd2_0_end
gcd2_0_else:
gcd2_0_end:
	movq 16(%rbp), %rax
        pushq %rax
	movq 24(%rbp), %rax
        movq %rax, %rbx
        popq %rax
	movq $0, %rdx
	idivq %rbx
	movq %rdx, %rax
	pushq %rax
	movq 24(%rbp), %rax
	pushq %rax
	call gcd2
	addq $16, %rsp
	movq %rbp, %rsp
	popq %rbp
	ret
main:
	pushq %rbp
	movq %rsp, %rbp
	subq $24, %rsp
	call read
	movq %rax, -8(%rbp)
	call read
	movq %rax, -16(%rbp)
	movq -16(%rbp), %rax
	pushq %rax
	movq -8(%rbp), %rax
	pushq %rax
	call gcd1
	addq $16, %rsp
	pushq %rax
	call print
	addq $8, %rsp
	movq -16(%rbp), %rax
	pushq %rax
	movq -8(%rbp), %rax
	pushq %rax
	call gcd2
	addq $16, %rsp
	pushq %rax
	call print
	addq $8, %rsp
	movq -16(%rbp), %rax
	pushq %rax
	movq -8(%rbp), %rax
	pushq %rax
	call gcd1
	addq $16, %rsp
        pushq %rax
	movq -16(%rbp), %rax
	pushq %rax
	movq -8(%rbp), %rax
	pushq %rax
	call gcd2
	addq $16, %rsp
        movq %rax, %rbx
        popq %rax
	subq %rbx, %rax
	movq %rax, -24(%rbp)
	movq -24(%rbp), %rax
	pushq %rax
	call print
	addq $8, %rsp
	movq $0, %rax
	movq %rbp, %rsp
	popq %rbp
	ret
# Procedure to read number from stdin
# C signature: long int read(void)
read:
        pushq %rbp
        movq %rsp, %rbp
        movq $0, %rdi
        movq $buf, %rsi
        movq $1024, %rdx
        movq $0, %rax
        syscall                 # %rax = sys_read(0, buf, 1024)
        ### convert string to integer:
        ### %rax contains nchar
        ### %rsi contains ptr
        movq $0, %rdx           # sum = 0
atoi_loop:
        cmpq $0, %rax           # while (nchar > 0)
        jle atoi_done           # leave loop if nchar <= 0
        movzbq (%rsi), %rbx     # move byte, and sign extend to qword
        cmpq $0x30, %rbx        # test if < '0'
        jl atoi_done            # character is not numeric
        cmpq $0x39, %rbx        # test if > '9'
        jg atoi_done            # character is not numeric
        imulq $10, %rdx         # multiply sum by 10
        subq $0x30, %rbx        # value of character
        addq %rbx, %rdx         # add to sum
        incq %rsi               # step to next char
        decq %rax               # nchar--
        jmp atoi_loop           # loop back
atoi_done:
        movq %rdx, %rax         # return value in RAX
        popq %rbp
        ret

# Procedure to print number to stdout
# C signature: void print(long int)
print:
        pushq %rbp
        movq %rsp, %rbp
        ### convert integer to string
        movq 16(%rbp), %rax     # parameter
        movq $(buf+1023), %rsi  # write ptr (start from end of buf)
        movb $0x0a, (%rsi)      # insert newline
        movq $1, %rcx           # string length
itoa_loop:                      # do.. while (at least one iteration)
        movq $10, %rbx
        movq $0, %rdx
        idivq %rbx              # divide rdx:rax by 10
        addb $0x30, %dl         # remainder + '0'
        decq %rsi               # move string pointer
        movb %dl, (%rsi)
        incq %rcx               # increment string length
        cmpq $0, %rax
        jg itoa_loop            # produce more digits
itoa_done:
        movq $1, %rdi
        movq %rcx, %rdx
        movq $1, %rax
        syscall
        popq %rbp
        ret

print_string:
        pushq %rbp
        movq %rsp, %rbp
        movq $1, %rdi
        movq 16(%rbp), %rsi
        movq 24(%rbp), %rdx
        movq $1, %rax
        syscall
        popq %rbp
        ret