#!/bin/bash

###
# Compile and run the project files
##

mkdir -p objects

javac -d objects `find src -type f -name "*.java"`
CLASSPATH=objects java main.java.ExampleMain
