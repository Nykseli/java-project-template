#!/bin/bash

###
# Remove all class files and the whole objects directory
##

rm -r objects
find -type f -name "*.class" -exec rm {} +
