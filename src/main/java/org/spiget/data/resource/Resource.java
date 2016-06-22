package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.author.Author;
import org.spiget.data.category.Category;
import org.spiget.data.resource.version.ResourceVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a full resource
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class Resource extends ListedResource {

	public static final Resource NULL = new Resource(-1, "", Author.NULL, Category.NULL);

	// Listed
//	protected String          name;
//	protected String          tag;
//	protected ResourceVersion version;
//	protected Author          author;
//	protected Category        category;
//	protected ResourceRating  resourceRating;
//	protected SpigetIcon      icon;
//	protected long            releaseDate;
//	protected long            updateDate;
//	protected int             downloads;

	// Full
	protected String description;
	protected String contributors;
	protected List<String> testedVersions = new ArrayList<String>();

	public Resource(int id, String name) {
		super(id, name);
	}

	public Resource(int id, String name, Author author, Category category) {
		this(id, name);
		this.author = author;
		this.category = category;
	}

	public Resource(ListedResource base) {
		super(base.id,base.name);
		this.name = base.name;
		this.tag = base.tag;
		this.version = new ResourceVersion(base.version);
		this.author = new Author(base.author);
		this.category = new Category(base.category);
		this.resourceRating = base.resourceRating;
		this.releaseDate = base.releaseDate;
		this.updateDate = base.updateDate;
		this.downloads = base.downloads;
	}

}
