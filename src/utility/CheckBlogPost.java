package utility;

import model.Blog;

public class CheckBlogPost  extends OffensiveWordsChecker implements OffensiveWordsInterface{
    String[] offensiveWords={"b!tch","2g1c","4r5e","5h1t","balls","a$$","a$$hole","babeland","bull shit","a54","a55","a55hole","acrotomophilia","aeolus","ahole","barf","bbw","anal","bdsm","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola"};
	int offensivetitle=0;
	int offensivedescription=0;
    @Override
	public boolean checkBlogTitle(Blog blog) {
		String title=blog.getBlogTitle();
		for(int i=0;i<offensiveWords.length;i++) {
			if(title.matches(offensiveWords[i])) {
				offensivetitle++;
			}
			}
		if(offensivetitle>=1) {
			return false;
		}
		else {
			return true;
		}
		}
		
	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description=blog.getBlogDescription();		
		for(int i=0;i<offensiveWords.length;i++) {
			if(description.matches(offensiveWords[i])) {
				offensivedescription++;
			}
			}
		if(offensivedescription>=1) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkBlog(Blog blog) {		
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}