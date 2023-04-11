package ru.tinkoff.edu.java.bot;

import org.springframework.stereotype.Service;

@Service
public class datafile {
    	    public static void updateLink(scrapperVOT linkUpdate) {
    	        if(linkUpdate.id() == 1){
    	            throw new ChatNotFoundException("Chat not found");
    	        }
    	        if(linkUpdate.id() == 2){
    	            throw new LinkNotFoundException("Link not found");
    	        }
    	    }

}
