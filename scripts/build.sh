#!/bin/bash
set -e

rm -rf out
mkdir -p out

javac -d out $(find /home/orbi7sync/Practice/JavaPractice/src -name "*.java")
echo "Build successful"
