package com.legendapl.app;

import java.io.InputStream;

public interface ArgumentResolver {
	Argument resolve(InputStream stream);
}
