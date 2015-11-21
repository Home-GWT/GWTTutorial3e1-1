package de.vogella.gwt.helloworld.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;

import de.vogella.gwt.helloworld.client.ui.WidgetTable;
import de.vogella.gwt.helloworld.shared.MyUser;

public class App implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final WidgetTable table = new WidgetTable();
	    Button           button = new Button("Показать");
	    
	    button.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
	     	List<MyUser> users = new ArrayList<MyUser>();
	    	
	  		MyUser user = new MyUser();
	  		user.setId("1");
	  		user.setUsername("Peter");
	  		user.setNumberOfHits("15");
	  		users.add(user);

	  		user = new MyUser();
	  		user.setId("2");
	  		user.setUsername("Hanz");
	  		user.setNumberOfHits("25");
	  		users.add(user);
	    
	  		user = new MyUser();
	  		user.setId("3");
	  		user.setUsername("Dima");
	  		user.setNumberOfHits("35");
	  		users.add(user);
	  			
	  		user = new MyUser();
	  		user.setId("4");
	  		user.setUsername("Nikolas");
	  		user.setNumberOfHits("45");
	  		users.add(user);
	    	  
	  		table.setInput(users);
	    }
	   });

	   RootPanel.get().add(button);
	   RootPanel.get().add(table);
	}

}
