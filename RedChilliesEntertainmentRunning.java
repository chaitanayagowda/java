class RedChilliesEntertainmentRunning{
	public static void main(String []entertainment){
		boolean isAdded=RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Amitha Bachchan");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Taapsee Pannu");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Gauri Khan");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Siddique");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Vijayaraghavan");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Bhiju Menon");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Mohanlal");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		isAdded=RedChilliesEntertainment.addMovieActors("Thilakan");
		System.out.println("RedChilliesEntertainment is added:"+isAdded);
		
		RedChilliesEntertainment.getMovieActors();
		
		boolean isUpdated=RedChilliesEntertainment.updateMovieActor("Gauri Khan","Freddy");
		System.out.println("RedChilliesEntertainment is updated:"+isUpdated);
		
		RedChilliesEntertainment.getMovieActors();
		
		RedChilliesEntertainment.deleteActorName("Mohanlal");
		RedChilliesEntertainment.deleteActorName("Thilakan");
				
		RedChilliesEntertainment.getMovieActors();

	}
}
		
		
		
		
		
		
	