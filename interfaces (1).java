

class AudioPlayer implements MediaPlayer
{

	public void play() {
		System.out.println("plays audio");
	}
	public void pause() {
		System.out.println("pause audio");
	}
	public void stop() {
		System.out.println("stop audio");
	}
}
class VideoPlayer implements MediaPlayer {
	public void play() {
		System.out.println("plays video");
	}
	public void pause() {
		System.out.println("pause video");
	}
	public void stop() {
		System.out.println("stop video");
	}
	public  void adjustPlaybackSpeed(double speed){
	    	System.out.println("video speed"+speed);
	}
	public  void enableSubtitles(boolean enable){
	    if(enable){
	        
	    
	    	System.out.println("subtitiles enabled");
	    }
	    else{
	        System.out.println("subtitiles disabled");
	    }
	}
}
class StreamingPlayer implements MediaPlayer {
    
    public void play() {
        System.out.println("Streaming content...");
    }

    
    public void pause() {
        System.out.println("Pausing streaming content...");
    }

    
    public void stop() {
        System.out.println("Stopping streaming content...");
    }
}
interface MediaPlayer {

	void play();


	void pause();


	void stop();
   
    default void adjustPlaybackSpeed(double speed){
        
    }
    
    default void enableSubtitles(boolean enable){
    
        
    }

}


public class interfaces {
	public static void main(String[] args) {

		interfaces obj=new interfaces();
		AudioPlayer obj1=new AudioPlayer();
		VideoPlayer obj2=new VideoPlayer();
		 StreamingPlayer obj3=new  StreamingPlayer();
		System.out.println("\nAudio Player:\n");
		obj1.play();
		obj1.pause();
		obj1.stop();
 		System.out.println("\nVideo Player:\n");

    obj2.play();
    obj2.pause();
    obj2.stop();
    obj2.adjustPlaybackSpeed(2.0);
    obj2.enableSubtitles(true);
    System.out.println("\nStreaming Player:\n");
		obj3.play();
		obj3.pause();
		obj3.stop();
	}
}