package Capstone;

import javax.swing.JOptionPane;

import org.omg.PortableInterceptor.IORInterceptor;

public class MeasurementConversion
{
	public MeasurementConversion()
	{
		String metericMeasurement = "\n0: Exit\n1: Kilometers\n2: Meters\n3: Centimeters";
		String englishMeasurement = "\n0: Exit\n1: Miles\n2: Yards\n3: Feet\n4: Inches";
		String chooseConversion = "\n0: Exit\n1: English measurement to Metric Measurement\n2: Metric Measurement to English Measurement";
		int convert = operation(chooseConversion);

		if (convert == 0)
			System.exit(0);

		if (convert == 1)
		{
			int ops = englishOperation("Which measurement would you like to convert" + englishMeasurement);
			int convertTo = conversionTo("Which measurement would you like to convert to " + metericMeasurement);

			switch (ops)
			{
			case 0:
				System.exit(0);
				break;

			case 1:// Miles
				String input = JOptionPane.showInputDialog("Enter the number of Miles");
				double miles = Double.parseDouble(input);

				double yards = convertMilesToYards(miles);
				double feet = convertYardsToFeet(yards);
				double inches = convertFeetToInches(feet);
				double centi = convertInchesToCentimeters(inches);
				double meters = convertCentimetersToMeters(centi);
				double kilo = convertMetersToKilometers(meters);

				if (convertTo == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + centi + " centimeters in " + input + " miles");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + meters + " meters in " + input + " miles");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + kilo + " kilometers in " + input + " miles");
				}

				break;

			case 2:// Yards
				String input2 = JOptionPane.showInputDialog("Enter the number of Yards");
				double yards2 = Double.parseDouble(input2);

				double feet2 = convertYardsToFeet(yards2);
				double inches2 = convertFeetToInches(feet2);
				double centi2 = convertInchesToCentimeters(inches2);
				double meters2 = convertCentimetersToMeters(centi2);
				double kilo2 = convertMetersToKilometers(meters2);

				if (convert == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + centi2 + " centimeters in " + input2 + " yards");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + meters2 + " meters in " + input2 + " yards");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + kilo2 + " kilometers in " + input2 + " yards");
				}

				break;

			case 3:// Feet
				String input3 = JOptionPane.showInputDialog("Enter the number of Feet");
				double feet3 = Double.parseDouble(input3);

				double inches3 = convertFeetToInches(feet3);
				double centi3 = convertInchesToCentimeters(inches3);
				double meters3 = convertCentimetersToMeters(centi3);
				double kilo3 = convertMetersToKilometers(meters3);

				if (convertTo == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + centi3 + " centimeters in " + input3 + " feet");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + meters3 + " meters in " + input3 + " feet");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + kilo3 + " kilometers in " + input3 + " feet");
				}

				break;

			case 4:// Inches
				String input4 = JOptionPane.showInputDialog("Enter the number of Inches");
				double inches4 = Double.parseDouble(input4);

				double centi4 = convertInchesToCentimeters(inches4);
				double meters4 = convertCentimetersToMeters(centi4);
				double kilo4 = convertMetersToKilometers(meters4);

				if (convertTo == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + centi4 + " centimeters in " + input4 + " inches");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + meters4 + " meters in " + input4 + " inches");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + kilo4 + " kilometers in " + input4 + " inches");
				}

			default:
				break;
			}
		}
		
		else if (convert == 2)
		{
			int ops2 = metricOperation("Which measurement would you like to convert" + metericMeasurement);
			int convertTo = conversionTo("Which measurement would you like to convert to" + englishMeasurement);

			switch (ops2)
			{
			case 0:
				System.exit(0);
				
			case 1: //Kilometers
				String input = JOptionPane.showInputDialog("Enter the number of Kilometers");
				double kilo = Double.parseDouble(input);

				double meters = convertKilometersToMeters(kilo);
				double centi = convertMetersToCentimeters(meters);
				double inches = convertCentimetersToInches(centi);
				double feet = convertInchesToFeet(inches);
				double yards = convertFeetToYards(feet);
				double miles = convertYardsToMiles(yards);

				if (convertTo == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + miles + " miles in " + input + " kilometers");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + yards + " yards in " + input + " kilometers");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + feet + " feet in " + input + " kilometers");
				}
				
				else if (convertTo == 4)
				{
					JOptionPane.showMessageDialog(null, "There are " + inches + " inches in " + input + "kilometers");
				}


				break;
				
			case 2: //Meters
				String input2 = JOptionPane.showInputDialog("Enter the number of meters");
				double meters2 = Double.parseDouble(input2);

				double centi2 = convertMetersToCentimeters(meters2);
				double inches2 = convertCentimetersToInches(centi2);
				double feet2 = convertInchesToFeet(inches2);
				double yards2 = convertFeetToYards(feet2);
				double miles2 = convertYardsToMiles(yards2);

				if (convertTo == 0)
					System.exit(0);

				else if (convertTo == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + miles2 + " miles in " + input2 + " meters");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + yards2 + " yards in " + input2 + " meters");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + feet2 + " feet in " + input2 + " meters");
				}
				
				else if (convertTo == 4)
				{
					JOptionPane.showMessageDialog(null, "There are " + inches2 + " inches in " + input2 + " meters");
				}


				break;
				
			case 3: //Centimeters
				String input3 = JOptionPane.showInputDialog("Enter the number of centimeters");
				double centi3 = Double.parseDouble(input3);

				double inches3 = convertCentimetersToInches(centi3);
				double feet3 = convertInchesToFeet(inches3);
				double yards3 = convertFeetToYards(feet3);
				double miles3 = convertYardsToMiles(yards3);

				if (convert == 0)
					System.exit(0);

				else if (convert == 1)
				{
					JOptionPane.showMessageDialog(null, "There are " + miles3 + " miles in " + input3 + " centimeters");
				}

				else if (convertTo == 2)
				{
					JOptionPane.showMessageDialog(null, "There are " + yards3 + " yards in " + input3 + " centimeters");
				}

				else if (convertTo == 3)
				{
					JOptionPane.showMessageDialog(null, "There are " + feet3 + " feet in " + input3 + " centimeters");
				}
				
				else if (convertTo == 4)
				{
					JOptionPane.showMessageDialog(null, "There are " + inches3 + " inches in " + input3 + " centimeters");
				}


				break;
			}
		}
	}

	public int englishOperation(String message)
	{
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}

	public int metricOperation(String message)
	{
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}

	
	//CASE 1
	//Converts Metric to English
	public double convertKilometersToMeters(double a)
	{
		return a * 1000;
	}
	
	public double convertMetersToCentimeters(double a)
	{
		return a * 100;
	}

	public double convertCentimetersToInches(double a)
	{
		return a * .39;
	}

	public double convertInchesToFeet(double a)
	{
		return a * .083;
	}

	public double convertFeetToYards(double a)
	{
		return a * .333;
	}

	public double convertYardsToMiles(double a)
	{
		return a * .000568;
	}

	
	//CASE 2
	//Convert English to Metric
	public double convertMilesToYards(double a)
	{
		return a * 1760;
	}

	public double convertYardsToFeet(double a)
	{
		return a * 3;
	}

	public double convertFeetToInches(double a)
	{
		return a * 12;
	}

	public double convertInchesToCentimeters(double a)
	{
		return a * 2.54;
	}

	public double convertCentimetersToMeters(double a)
	{
		return a * .01;
	}

	public double convertMetersToKilometers(double a)
	{
		return a * .001;
	}

	public int conversionTo(String message)
	{
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}

	public int operation(String options)
	{
		String input = JOptionPane.showInputDialog("Which conversion would you like to do? " + options);
		return Integer.parseInt(input);
	}
}
