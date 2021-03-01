import java.util.*;  
import java.io.*;  
class Players implements Comparable<Players>{  
int Score;  
String name;  

Players(int Score,String name){  
this.Score=Score;  
this.name=name;  
 
}  
public int compareTo(Players st){  
if(Score==st.Score)  
return 0;  
else if(Score>st.Score)  
return -1;  
else  
return 1;  
}  
}  
