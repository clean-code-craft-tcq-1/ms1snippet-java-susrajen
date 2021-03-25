# Charge Validation Tool

This is a tool to validate charging parameters.

Given a set of values, it checks if they have 'sudden jumps'.
Such jumps indicate a failed / noisy sensor.

## Tasks

1. The 'No Duplications' check is failing. Resolve the duplication.
2. Give a good name to the function `_give_me_a_good_name`.
It is a boolean function, used in `if` statements.
Ensure that the `if` statement reads like a sentence after you rename the function.
3. The `values` parameter, given to the `validate...` function can be null.
Currently, the code does not handle that.
Ensure the code ignores a call with a null-parameter and add a test for that.


## Changes Incorporated
1. Duplication is removed.
2. Function is renamed in a readable manner.
3. Added Null check for the sensor readings.
4. Added Test cases for null check for sensor readings.
5. Added a check to see if the readings list is empty.
6. Added Test cases for validating list size for sensor readings.
7. Made the functions pure, wherever possible.
