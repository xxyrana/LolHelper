/**
 * 
 */
package com.fourfoureight.lolhelper.api.dto.staticdata.Champion;

import com.fourfoureight.lolhelper.api.dto.staticdata.Image;

/**
 * @author Shyos
 * 
 */
public class Passive {
	private String description;
	private Image image;
	private String name;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
