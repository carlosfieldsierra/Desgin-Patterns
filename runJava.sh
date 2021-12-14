#!/bin/bash
if [ $1 == "-all" ]; then
    javafiles=$(ls *.java)
    for line in $javafiles; do
        javac $line
    done
fi
javac Main.java
clear
java Main