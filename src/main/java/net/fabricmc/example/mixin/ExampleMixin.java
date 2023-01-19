package net.fabricmc.example.mixin;

import net.fabricmc.example.ExampleInterface;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.*;

@Mixin(Screen.class)
@Implements(@Interface(iface = ExampleInterface.class, prefix = "ei$"))
public abstract class ExampleMixin {

	@Intrinsic
	public Text ei$getTitle() {
		return Text.of("This is just for testing");
	}

}
