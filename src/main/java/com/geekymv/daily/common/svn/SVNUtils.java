package com.geekymv.daily.common.svn;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;


public class SVNUtils {
	
	static {
		DAVRepositoryFactory.setup();
	}
	
	public SVNUtils() {
		try {
			
			SVNURL url = SVNURL.parseURIDecoded("https://svn.iflytek.com:8888/svn/HR_smartcity/协作管理/各地项目实施数据/城市令定制组/工作日报");
			SVNRepository repository = SVNRepositoryFactory.create(url);
			
			ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager("miying", "geekymv8821823?");  
	        repository.setAuthenticationManager(authManager);  
			
	        SVNURL svnurl = repository.getRepositoryRoot(true);
	        System.out.println(svnurl);
	        
		} catch (SVNException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		SVNUtils svnUtils = new SVNUtils();
	}
	

}
