// 
// Decompiled by Procyon v0.5.36
// 

package ui.input.output;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileTypeFilter extends FileFilter
{
    private String extension;
    private String description;
    
    public FileTypeFilter(final String extension, final String description) {
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(final File file) {
        return file.isDirectory() || file.getName().toLowerCase().endsWith(this.extension);
    }
    
    @Override
    public String getDescription() {
        return String.valueOf(this.description) + String.format(" (*%s)", this.extension);
    }
}
