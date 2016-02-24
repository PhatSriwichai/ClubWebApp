package app

import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.*
import com.vaadin.grails.Grails

import com.vaadin.annotations.Theme
import app.*

class ClubData extends CustomComponent{
	public ClubData(){
		Panel panel = new Panel()
		VerticalLayout layout = new VerticalLayout()

		panel.setContent(layout)

		//TabSheet order = new TabSheet()
		//VerticalLayout tab = new VerticalLayout()
		//tab.addComponent(new ClubData())

		setCompositionRoot(panel)
	}
	

}