.global _start
.data
.text
_start:
	call main
	movq $0, %rdi
	movq $60, %rax
	syscall
main:
	pushq %rbp
	movq %rsp, %rbp
	movq %rbp, %rsp
	popq %rbp
	movq $1, %rax
	ret
