





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
