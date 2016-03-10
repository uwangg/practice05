package prob3;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	static void printSound(Object obj)
	{
		if( obj instanceof Soundable )
		{
			Soundable sd = (Soundable)obj;
			System.out.println(sd.sound());
		}
	}
}
