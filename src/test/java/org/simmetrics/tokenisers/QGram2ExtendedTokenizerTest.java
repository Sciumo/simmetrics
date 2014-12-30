/*
 * SimMetrics - SimMetrics is a java library of Similarity or Distance
 * Metrics, e.g. Levenshtein Distance, that provide float based similarity
 * measures between String Data. All metrics return consistent measures
 * rather than unbounded similarity scores.
 * 
 * Copyright (C) 2014  SimMetrics authors
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */
package org.simmetrics.tokenisers;

import org.simmetrics.tokenisers.QGram2ExtendedTokenizer;
import org.simmetrics.tokenisers.Tokenizer;

public class QGram2ExtendedTokenizerTest extends TokeniserTest {

	@Override
	protected Tokenizer getTokenizer() {
		return new QGram2ExtendedTokenizer();
	}

	@Override
	public T[] getTests() {

		return new T[] {
				new T("123456789", 
						"#1", "12", "23", "34", "45", "56", "67", "78", "89","9#"),
				new T("123456789123456789", 
						"#1", "12", "23", "34", "45", "56", "67", "78", "89",
						"91", "12", "23", "34", "45", "56", "67", "78", "89","9#"
						) };
	}
}
