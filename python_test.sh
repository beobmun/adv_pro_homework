#!/bin/bash

# This script finds and runs all Python files in subdirectories for testing.

# Loop through all Python files in subdirectories
find . -type f -name "*.py" | while read -r file; do
    echo "Running tests in: $file"
    python3 "$file"
    if [ $? -eq 0 ]; then
        echo "Test passed for: $file"
    else
        echo "Test failed for: $file"
    fi
    echo "---------------------------"
done