/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package myguiproject;
import java.math.*;

public class Color {
    private float x;
    private float y; 
    private float z;
    private boolean isRGB;

    public Color(float x, float y, float z, boolean isRGB) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.isRGB = isRGB;
    }
    
    public void toHSV(){
        float R = this.x/255;
        float G = this.y/255;
        float B = this.z/255;
        float max,min,delta;
        
        max = Math.max(Math.max(R,G),B);
        min = Math.min(Math.min(R,G), B);
        
        delta = max - min;
        
        if (delta == 0)
            this.x = 0;     //this.x es H = 0
        else if (max == R)
            this.x = 60*(((G-B)/delta)%6);
        else if (max == G)
            this.x = 60*(((B-R)/delta)+2);
        else if (max == B)
            this.x = 60*(((R-G)/delta)+4);
        if (max == 0)
            this.y = 0; //this.y es S = 0
        else if (max !=0)
            this.y = (delta/max)*100;
         this.z = (max)*100; //this.z es V = 0
    }  
    public void toRGB(){
        float H = this.x;
        float S = this.y*100;
        float V = this.z*100;
        float C,X,m,R = 0,G = 0,B =0;
        C = V*S;
        X = C*(1-Math.abs(((H/60)%2)-1));
        m = V-C; 
        
        if((H >= 0)&&(H < 60)){
            R=C; G=X; B=0;
        }
        if((H >= 60)&&(H < 120)){
            R=X; G=C; B=0;
        }
        if((H >= 120)&&(H < 180)){
            R=0; G=C; B=X;
        }
        if((H >= 180)&&(H < 240)){
            R=0; G=X; B=C;
        }
        if((H >= 240)&&(H < 300)){
            R=X; G=0; B=C;
        }
        if((H >= 300)&&(H < 360)){ 
            R=C; G=0; B=X;
        }
        this.x = (R+m)*255; //this.x es R = 0
        this.y = (G+m)*255; //this.y es G = 0
        this.z = (B+m)*255; //this.z es B = 0
    }
}
*/