package vitals;

public class Main {
    
  public static boolean isTemperatureOk(float temp) {
    if(temp<0) {
      System.out.println("Temperature is too low");
      return false;
    }
    else if(temp>45) {
      System.out.println("Temperature is too high");
      return false;
    }
    System.out.println("Temperature is OK");
    return  true;
  }
  
  public static boolean isChargingStateOk(float soc) {
    if(soc<20) {
      System.out.println("charging state is at very low for now, Dont remove charging");
      return false;
    }
    else if(soc>80) {
      System.out.println("charging state is at High, we can remove charging");
      return false;
    }
    System.out.println("Vehicle is not charged yet, Keep charging ON");
    return  true;
  }
  
  
  public static boolean isChargingRateOk(float chargeRate) {
    if(chargeRate> 0.8) {
      System.out.println("charging rate is high, Stop charging");
      return false;
    }
    System.out.println("Charging Rate is OK");
    return  true;
  }
  
  public static boolean isVoltageOk(float volt) {
    if(volt<2.3) {
      System.out.println("voltage is too low, kindly stop charging");
      return false;
    }
    else if(volt>4.3) {
      System.out.println("voltage is too high, kindly stop the charging");
      return false;
    }
    System.out.println("Voltage is OK");
    return  true;
  }

    public static void main(String[] args) {
      testBatteryCharge();
    }
    
    public static void testBatteryCharge() {
      assert(isTemperatureOk(25) == true);
      assert(isChargingStateOk(75) == false);
      assert(isChargingRateOk(0.7f) == true);
      assert(isVoltageOk(2.45f) == false);
    }
}
