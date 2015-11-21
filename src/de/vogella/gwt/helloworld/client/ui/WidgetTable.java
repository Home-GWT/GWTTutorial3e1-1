package de.vogella.gwt.helloworld.client.ui;

import java.util.*;
import com.google.gwt.user.client.ui.*;
import de.vogella.gwt.helloworld.shared.*;

public class WidgetTable extends FlexTable {
	
  	public WidgetTable() {
  		this.setCellPadding(5);
  		this.setCellSpacing(0);
  		this.setBorderWidth(1);
  		
  		List<String> headers = new ArrayList<>();
  		headers.add("Id");
  		headers.add("Name");
  		headers.add("Number");
		int column=0;
		for(String header:headers) this.setText(0,column++,header);
  		this.getRowFormatter().addStyleName(0,"tableHeader");
  	}

  	public void setInput(List<MyUser> users) {
  		int row=1;
  		for(MyUser user:users){
  			this.setText(++row,0,user.getId());
  			this.setText(row,1,user.getUsername());
  			this.setText(row,2,user.getNumberOfHits());
  		}
  	}
  	
} 