package code.comb;

import flexagon.fd.core.plugin.AbstractPluginProvider;
import flexagon.fd.core.plugin.PluginResult;
import flexagon.ff.common.core.exceptions.FlexCheckedException;

public class Build extends AbstractPluginProvider{
	public Build()
	  {
	    super();
	  }
	 
	  public void validate()
	    throws FlexCheckedException
	  {
	    //TODO
	  }
	 
	  public PluginResult execute()
	    throws FlexCheckedException
	  {
	    System.out.println("Hello world");
		return null;
	
		
	  }
	 
	  public void cleanup()
	  {
	    //TODO
	  }

}
