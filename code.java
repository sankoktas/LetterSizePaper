# LetterSizePaper
This program converts dimensions of a letter from inches to milimeters

public class KFS_LetteSizePaper_Main
{
    public static void main (String[] args)
    {
        final double conversion_inch_to_mm = 25.4;
        
        double width_in_inch = 8.5;
        double length_in_inch = 11; 
	
        double width_in_mm = width_in_inch * conversion_inch_to_mm;
        double length_in_mm = length_in_inch * conversion_inch_to_mm;
	
        System.out.println("Characteristics of an 8.5 x 11 inch sheet in mm");
        System.out.print("width: " + width_in_mm);
        System.out.println(" mm");
        System.out.print("length: " + length_in_mm);
        System.out.println(" mm");
    }   
}
