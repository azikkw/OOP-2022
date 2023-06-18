package Problem1;

import java.io.Serializable;

// The interface defines only the behavior, they don't care what kind of object it is
// Also interfaces 'Cross cutting functionality', it means that they can link unrelated classes (Like Person and Animal)
// Interfaces do not have any constructors

public interface HaveVoice extends Serializable, Cloneable // Can extend more than one
{
	// Fields only public static final
	int voiceVolume = 5;
	int voiceDuration = 8; // Error because field not initialized, in interface fields should be initialized
	
	// Methods can be only public, and not have realization
	void voice();
	public void voice1(); // Error because protected not allowed
}