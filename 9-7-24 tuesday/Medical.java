


 class Medical {

    public static double getMedicinePrice(String medicineName) {
        if (medicineName=="Paracetomal")
		{
            return 10.0;
        } 
		else if (medicineName=="Saridon") 
		{
            return 15.0;
        } 
		else if (medicineName=="Azithromycin")
		{
            return 20.0;
        }
		else
		{
            return -1;// "Price not found for this medicine";
        }
    }

    public static String getMedicineName(String symptom) 
	{
        if (symptom=="Fever")
		{
            return "Paracetomal";
        } 
		else if (symptom=="headache") 
		{
            return "Saridon";
        }
		else if (symptom=="Infection") 
		{
            return "Azithromycin";
        }
		else 
		{
            return "Medicine not found for this symptom";
        }
    }

    public static String getAvailability(String doctorName) {
        if (doctorName=="Doctor Parmesh")
		{
            return "Available on Mondays and Wednesdays";
        } 
		else if (doctorName=="Doctor Divya")
		{
            return "Available on Tuesdays and Thursdays";
        }
		else if (doctorName=="Doctor Rachita")
		{
            return "Available on Fridays and Saturdays";
        }
		else
		{
            return "Availability not found for this doctor";
        }
    }
 }
    


