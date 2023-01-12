package iwwwdnw.gui;

import iwwwdnw.gui.impl.GuiFactoryImpl;

public interface GuiFactory {
	GuiFactory FACTORY = new GuiFactoryImpl();
}
