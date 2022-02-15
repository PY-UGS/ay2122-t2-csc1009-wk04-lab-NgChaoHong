package Lab4;

public class BMI {
    private double Kilogram;
    private double Pounds;
    private double Meters;
    private double Inchs;
    private double BMI;
    private static final double KgtoP =  0.45359237;
    private static final double METER = 0.0254;

    public BMI(){
        this.Kilogram = this.Pounds*KgtoP;
        this.Meters = this.Inchs*METER;
    }
    public BMI(double Pounds, double Inchs){
        this.Pounds = Pounds;
        this.Inchs = Inchs;
    }


    public void setKilogram(double Kilogram){
        this.Kilogram = Kilogram;
    }
    public void setPounds(double Pounds){
        this.Pounds = Pounds;
        this.Kilogram = this.Pounds*0.45359237;
    }
    public void setMeters(double Meters){
        this.Meters = Meters;
    }
    public void setInchs(double Inchs){
        this.Inchs = Inchs;
        this.Meters = this.Inchs*0.0254;
    }


    public double getKilogram(){
        return this.Kilogram;
    }
    public double getPounds(){
        return this.Pounds;
    }
    public double getInchs(){
        return this.Inchs;
    }
    public double getMeters(){
        return this.Meters;
    }

    public double CalculateBMI(){
        
        this.BMI =  (this.Kilogram)/(this.Meters*this.Meters);
        return this.BMI;
    }
    public String CheckHealth(double BMI){
        
        if(BMI < 18.5){
            return "Underweight";
        }
        else if(18.5 <= BMI && BMI < 25.0){
            return "Normal";
        }
        else if(25.0 <= BMI && BMI < 30.0){
            return "Overweight";
        }
        else if (30.0 <= BMI){

            return "Obese";
        }
        else{
            return "Out of range";
        }
        
        
    }
}
