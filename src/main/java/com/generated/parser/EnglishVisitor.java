// Generated from English.g4 by ANTLR 4.7

    package com.generated.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnglishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnglishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(EnglishParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#independent_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndependent_clause(EnglishParser.Independent_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#dependent_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_clause(EnglishParser.Dependent_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#interjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterjection(EnglishParser.InterjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#subordinating_conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubordinating_conjunction(EnglishParser.Subordinating_conjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(EnglishParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(EnglishParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#noun_phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun_phrase(EnglishParser.Noun_phraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#adjective_phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective_phrase(EnglishParser.Adjective_phraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#adverbial_phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#prepositional_phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#verb_phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb_phrase(EnglishParser.Verb_phraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#infinitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinitive(EnglishParser.InfinitiveContext ctx);
}