import java.util.*;
class RedChilliesEntertainment{
static String name="New Entertainment";
static String ownerName="Vaishnavi";
static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String movieActor){
System.out.println("addMovieActors started");
boolean isMovieActors=false;
if(movieActors!=null){
movieActors[index]=movieActor;
index++;
isMovieActors=true;
}else{
System.out.println("the given actor name is not valid,give correct name");
}
System.out.println("movieActors ended");
return isMovieActors;
}
public static void getMovieActors(){
for(String movieActors:movieActors){
System.out.println(movieActors);
}
return;
}

public static boolean updateMovieActor(String oldMovieActor,String newMovieActor){
	System.out.println("updateMovieActor started");
	boolean isMovieActorUpdated=false;
	for(int index=0;index<movieActors.length;index++){
		if(oldMovieActor==movieActors[index]){
			movieActors[index]=newMovieActor;
			isMovieActorUpdated=true;
		}
	}
	if(isMovieActorUpdated==false){
		System.out.println("movie actor name not found"+oldMovieActor);
	}
	System.out.println("updateMovieActor ended");
	return isMovieActorUpdated;
}
public static boolean deleteActorName(String actorNameTobeDeleted){
	System.out.println("deleteActorName started");
	boolean isActorNameDeleted=false;
	int oldIndex, newIndex;
	for(newIndex=0, oldIndex=0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex]!=actorNameTobeDeleted){
			movieActors[newIndex]=movieActors[oldIndex];
			newIndex++;
		}
	}
	movieActors=Arrays.copyOf(movieActors,newIndex);
	if(movieActors!=null){
		isActorNameDeleted=true;
	}
	if(isActorNameDeleted==false){
		System.out.println("the actor name not found:"+actorNameTobeDeleted);
	}
	System.out.println("deleteActorName ended");
	return isActorNameDeleted;
}
}