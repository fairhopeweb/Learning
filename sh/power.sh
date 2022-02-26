#!/bin/bash
# In The Name Of God
# ========================================
# [] File Name : power.sh
#
# [] Creation Date : 28-12-2016
#
# [] Created By : Parham Alvani (parham.alvani@gmail.com)
# =======================================

power() {
	a=$1
	b=$2
	answer='1'

	for ((i = 0; i < b; i++)); do
		answer=$((a * answer))
	done

	echo $answer
}

power "$@"
