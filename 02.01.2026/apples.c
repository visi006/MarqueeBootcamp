Problem statement: Moving Apples
There are N number of baskets, where the basket contains  apples.
We want to move apples between baskets so that all baskets have the same number of apples. What is the minimum number of apples that must be moved?
It is guaranteed that there exists a way to move apples so as to have an equal number of apples in each basket
Input Specification:
inpu t: N, denoting the Number of Baskets
input2: array representing the number of apples in the ith basket
Output Specification:
Return the minimum number of apples that must be moved so that all baskets have the same number of apples
Example 1:
input1: 2
input2: (1,3)
Output: 1
Explanation:
There are 2 baskets with first contaming 1 apple and second containing 3 apples
If we shift one apple from the second container to the first container then both will have 2 apples So only one apple was required to move Hence the output is 1

7
10 8 12  7 10 4  5




C Code for the given problem statement :


#include<stdio.h>

// num++ post
// ++num pre
int main()
{

    int n;
    scanf("%d", &n);
    int bags [ n ]; // variable length array
                    // dynamically allocated
                    // alloca() -> stack
                    // should not be initialised
                    // using { initialiser list }
    int bags_ind;
    for( bags_ind = 0; bags_ind < n; bags_ind+=1)
    {
        scanf("%d", &bags [ bags_ind ]);
    }
    int sum;
    double average;
    sum = 0;
    for( bags_ind = 0; bags_ind < n; bags_ind+=1)
    {
        sum+= bags [ bags_ind ];
    }
    average = sum / n;
    int apples_moved = 0;
    for( bags_ind = 0; bags_ind < n; bags_ind+=1)
    {
        if ( bags [ bags_ind ] > average)
        apples_moved += bags [ bags_ind ] - average ;
    }
    printf("%d", apples_moved);



}
