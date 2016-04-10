package ckhbox.villagebox.client.gui.guidebook.page;

import java.util.ArrayList;
import java.util.Stack;

import ckhbox.villagebox.client.gui.guidebook.GuiGuideBook;
import ckhbox.villagebox.client.gui.guidebook.page.link.Link;
import ckhbox.villagebox.common.village.profession.Profession;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public abstract class Page {
	
	public GuiGuideBook guiGuideBook;
	private ArrayList<Link> links = new ArrayList<Link>();
	public String currentLink;
	
	//flow layout (not a real flow layout =P)
	private int flowLeft;
	private int flowTop;
	private int flowBot;
	private String title;
	
	public Page(GuiGuideBook guiGuideBook,String title){
		this.guiGuideBook = guiGuideBook;
		this.flowLeft = this.guiGuideBook.getContentLeft();
		this.flowTop = this.guiGuideBook.getContentTop();
		this.flowBot = this.flowTop;
		if(title != null){
			this.title = title;
			this.setFlowTop(this.guiGuideBook.getContentTop() + 16);
		}
	}
	
	public void addLink(Link link, boolean newLine){
		
		if(this.flowLeft > 0 && (newLine || this.flowLeft + link.width > this.guiGuideBook.getContentRight())){
			this.flowLeft = this.guiGuideBook.getContentLeft();;
			this.flowTop = this.flowBot;
			this.flowBot = this.flowTop + link.height;
		}
		
		link.left = this.flowLeft;
		link.top = this.flowTop;
		this.flowLeft += link.width + 4;
		this.flowBot = this.flowTop + link.height;
		
		this.links.add(link);
	}
	
	/**
	 * @param link
	 * @param align 0=force left, 1= force middle, 2=force right
	 */
	public void addLink(Link link, int top, int align){
		
		if(align == 2){
			link.left = this.guiGuideBook.getContentRight() - link.width;
		}
		else if(align == 1){
			link.left = this.guiGuideBook.getContentLeft() + (this.guiGuideBook.getContentWidth() - link.width)/2;
		}
		else{
			link.left = this.guiGuideBook.getContentLeft();
		}
	
		link.top = top;
		
		this.links.add(link);
	}
	
	public void addLinkAt(Link link, int top, int left){	
		link.left = left;
		link.top = top;
		
		this.links.add(link);
	}
	
	public abstract void onInit();
	
	public void setFlowTop(int top){
		this.flowTop = top;
		this.flowBot = this.flowTop;
		this.flowLeft = this.guiGuideBook.getContentLeft();
	}
	
	public void onDrawScreen(int mouseX, int mouseY){		
		//title
		if(this.title != null){
			GlStateManager.disableLighting();
			int top = this.guiGuideBook.getContentTop();
			int left = this.guiGuideBook.getContentLeft() + (this.guiGuideBook.getContentWidth() - this.guiGuideBook.mc.fontRendererObj.getStringWidth(this.title))/2;
			this.guiGuideBook.mc.fontRendererObj.drawString(this.title, left, top, 0xFF555500, false);
			GlStateManager.enableLighting();
		}
		//links
		for(Link link : this.links){
			if(link.isMouseHover(mouseX, mouseY)){
				link.onDrawHover(mouseX, mouseY);
			}
			else{
				link.onDraw(mouseX, mouseY);
			}
		}		
		//tooltips
		for(Link link : this.links){
			if(link.isMouseHover(mouseX, mouseY)){
				link.onDrawToolTip(mouseX, mouseY);
			}
		}		
	}
	
	public void onMouseClick(int mouseX, int mouseY){
		for(Link link : this.links){
			if(link.isMouseHover(mouseX, mouseY)){
				if(link.link != null){
					this.guiGuideBook.mc.getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation("gui.button.press"), 1.0F));
					this.guiGuideBook.gotoLink(link.link);
					break;
				}
			}
		}
	}
}
