package pt.isel.ls.html2;

import java.io.IOException;
import java.io.Writer;

public interface Writable {
    void writeTo(Writer writer) throws IOException;
}
