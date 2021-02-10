//练习 7-12

//本题真的做不来

//搜到的 c 语言解法，可是我没学过 c 语言，看不懂
// #include <stdio.h>

// int rotate_l(unsigned int number, unsigned int bit);

// int main(void) {
//     unsigned int number, bit;
//     printf("input a hexadecimal number and rotated bits number (q to quit):");
//     while( scanf("%x%d", &number, &bit) == 2 ) {
//         printf("%x rotate %d bit left : %x\n",  number, bit, rotate_l(number, bit));
//         printf("input a number(q to quit):");
//     }      
//     printf("quit\n");
//     return 0;
// } 

// int rotate_l(unsigned int number, unsigned int bit) {
//     unsigned int i;
//     unsigned int hign = 8 * sizeof(unsigned int); //最高位 //我感觉他是 high 拼写错了
//     for (i=0; i<bit; i++)
//         if( number&( 1<<(hign-1) ) )
//              number = (number << 1) | 1;
//         else 
//             number = number << 1;
 
//     return number;
// } 

  
  

 
