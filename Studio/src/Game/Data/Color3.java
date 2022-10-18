package Game.Data;

import static java.lang.Math.abs;

public class Color3 {

    public double fR, fG, fB;

    // Constructors

    public double RITF(int num){


        if (!( num>=0 && num<=255 ) ) {
            System.out.println("Unable to construct Color3.");
            return 0.0;
        } else {

            double floatNum;

            floatNum = num / 255.0;

            return floatNum;
        }
    }

    public static Color3 Color3New(double r, double g, double b){

        Color3 newColor = new Color3();
        if (!((r>=0&&r<=1) && (g>=0&&g<=1) && (b>=0&&b<=1))) {
            System.out.println("Unable to construct Color3.");
            return null ;
        } else {

            newColor.fR = r;
            newColor.fG = g;
            newColor.fB = b;

            return newColor;
        }
    }

    public Color3 Color3FromRGB(int r, int g, int b){

        if (!((r>=0&&r<=255) && (g>=0&&g<=255) && (b>=0&&b<=255))) {
            System.out.println("Unable to construct Color3.");
            return null;
        } else {

            this.fR = RITF(r);
            this.fG = RITF(g);
            this.fB = RITF(b);

            return this;
        }
    }

    /*public Color3 Color3FromHSV(int h, float s, float v) {

        if (!((h >= 0 && h <= 360) && (s >= 0 && s <= 1) && (v >= 0 && v <= 1))) {
            System.out.println("Unable to construct Color3.");
            return null;
        } else {

            double C = v*s;
            double M = v - C;
            double X = C*(1 - (Math.abs( (h/60)%2 - 1) ) );

            double rD, gD, bD;

            if (0<=h &&  h<60){
                rD = C;
                gD = X;
                bD = 0;
            } else if (60<=h &&  h<120) {
                rD = X;
                gD = C;
                bD = 0;
            } else if (120<=h &&  h<180) {
                rD = 0;
                gD = C;
                bD = X;
            } else if (180<=h &&  h<240) {
                rD = 0;
                gD = X;
                bD = C;
            } else if (240<=h &&  h<300) {
                rD = X;
                gD = 0;
                bD = C;
            } else if (300<=h &&  h<360) {
                rD = C;
                gD = 0;
                bD = X;
            }

            int r, g, b;

            r = (rD+M)*255;
            g = (gD+M)*255;
            b = (bD+M)*255;

            fR = RITF(r);
            fG = RITF(g);
            fB = RITF(b);

            return this;
        }
    }
    */
    //LERP; TOHEX REQ
}
