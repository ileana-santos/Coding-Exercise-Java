/* We want make a package of goal kilos of chocolate. 
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use
big bars before small bars. Return -1 if it can't be done.*/

//Option 1
public int makeChocolate(int small, int big, int goal) {
    // Calculate the maximum number of big bars we can use
    int bigBarsNeeded = Math.min(big, goal / 5);
    
    // Calculate the remaining goal after using big bars
    int remainingGoal = goal - (bigBarsNeeded * 5);
    
    // Check if the remaining goal can be satisfied with small bars
    if (small >= remainingGoal) {
        return remainingGoal;
    } else {
        return -1;
    }
}

//Option 2
public int makeChocolate(int small, int big, int goal) {
    // Use as many big bars as possible to reduce the goal
    while (goal >= 5 && big > 0) { // While goal is greater than or equal to 5 and there are big bars available
        goal -= 5; // Reduce the goal by 5 (since each big bar contributes 5 to the goal)
        big--;     // Decrement the count of big bars used
    }
    
    // Check if the remaining goal can be satisfied with small bars
    if (goal <= small) // If the remaining goal is less than or equal to the number of small bars available
        return goal;   // Return the remaining goal (as it can be satisfied with available small bars)
    else 
        return -1;     // Return -1 to indicate that it's not possible to achieve the goal with the given resources
}

//exercise from CodingBat
