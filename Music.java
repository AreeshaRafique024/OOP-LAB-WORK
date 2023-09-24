public class Music{
    String title;
    String duration;
    String genre;
    Date releaseDate;
    Singer singer;

public Music(String title,String duration,String genre,Date releaseDate , Singer singer){
    this.title=title ;
    this.duration=duration;
    this.genre=genre;
    this.releaseDate=releaseDate;
    this.singer=singer;
}
public void setTitle(String title){
    this.title=title;
}
public String getTitle(){
return title;
}

public void setDuration(String duration){
    this.duration=duration;
}
public String getDuration(){
return duration;
}

public void setGenre(String genre){
    this.genre=genre;
}
public String getGenre(){
    return genre;
}

public void setReleaseDate(Date releaseDate){
    this.releaseDate=releaseDate;
}
public Date getReleaseDate(){
    return releaseDate;
}

public void setSinger(Singer singer){
    this.singer=singer;
}
public Singer getSinger(){
    return singer;
}

public String toString(){
    return String.format("%s%s%s%s%s",title,duration,releaseDate,genre,singer);
}
public boolean equals(Object o){
    if(o instanceof Music){
        Music m = (Music)o;
    
    if (this.getReleaseDate()==m.getReleaseDate()){
        return true;
    }

    
}
}
}
