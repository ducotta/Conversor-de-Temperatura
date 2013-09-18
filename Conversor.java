
package conversor;

public class Conversor {

	/**
	 * @return 
	 * @Eduardo L Cotta
	 */
	
	 // TODO Auto-generated method stub
	public int conversorCelsiusParaFahrenheit (){
		return 9 * 40 / 5 + 32;
	}
	
	public int conversorCelsiusParaFahrenheit (int tempCelsius){
		return 9 * tempCelsius / 5 + 32;
	}
		
	public double conversorCelsiusParaFahrenheit (double tempCelsius){
		return 9.0 * tempCelsius / 5.0 + 32.0;
	}	
	
	public double conversorFahrenheitParaCelsius (double tempFahrenheit){
		return 5.0 * (tempFahrenheit - 32.0) / 9.0;
	}
	
	public double conversorCelsiusParaKelvin (double tempCelsius){
		return tempCelsius + 273.0;
	}
	
	public double conversorKelvinParaCelsius (double tempKelvin){
		return tempKelvin - 273.0;
	}
	
	public double conversorKelvinParaFahrenheit (double tempKelvin){
		return 9 * (tempKelvin - 273.0) / 5.0 + 32.0;
	}
	
	public double conversorFahrenheitParaKelvin (double tempFahrenheit){
		return 273.0 + 5.0 * (tempFahrenheit - 32.0) / 9.0;
	}
	
}
