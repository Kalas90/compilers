.global _start
.data
.text
_start:
	call main
	movq $0, %rdi
	movq $60, %rax
	syscall
f:
	pushq %rbp
	movq %rsp, %rbp
	movq %rbp, %rsp
	popq %rbp
	movq $2, %rax
	ret
main:
	pushq %rbp
	movq %rsp, %rbp
	call f
	movq %rbp, %rsp
	popq %rbp
	movq $1, %rax
	ret
