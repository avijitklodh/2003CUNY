#!/bin/bash

export FILTER_BRANCH_SQUELCH_WARNING=1

gitPurge () {
	for deletion in .settings target .classpath .project
	do
		git filter-branch --force --index-filter "git rm -r --cached --ignore-unmatch ./$1/$deletion" --prune-empty --tag-name-filter cat -- --all
	done
}

echo */ | tr " " "\n" | xargs -n1 | gitPurge
