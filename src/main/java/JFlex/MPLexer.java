package JFlex;// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Lekser.flex

import Parser.sym;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public
class MPLexer implements Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\2\0\1\6\2\0\1\7\2\0\1\10\1\11\1\0"+
    "\1\12\1\0\1\13\1\14\11\15\1\16\1\0\1\17"+
    "\1\20\1\21\1\22\1\23\4\24\1\25\1\24\14\26"+
    "\1\27\7\26\3\0\1\30\1\31\1\0\1\32\4\26"+
    "\1\33\2\26\1\34\10\26\1\35\1\26\1\36\6\26"+
    "\12\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\3\1\1\3\1\4\1\5\1\6"+
    "\2\7\1\10\1\11\1\12\1\13\2\1\2\14\2\1"+
    "\1\14\1\1\1\2\1\15\1\0\3\1\1\3\1\4"+
    "\1\5\1\6\2\7\1\10\1\11\1\12\1\13\2\1"+
    "\2\14\2\1\1\14\1\16\1\17\1\20\1\7\1\0"+
    "\1\21\1\0\1\7\1\22\1\23\1\24\1\25\1\26"+
    "\3\14\1\27\1\30\1\16\1\17\1\20\1\7\1\0"+
    "\1\15\1\21\1\0\1\7\1\22\1\23\1\24\1\25"+
    "\1\26\3\14\1\27\1\30\2\31\1\7\1\14\2\31"+
    "\1\7\1\14\1\0\1\14\1\0\1\14\1\0\1\32"+
    "\1\0\1\32\2\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\76\0\135\0\174\0\233\0\76"+
    "\0\76\0\76\0\272\0\331\0\370\0\76\0\u0117\0\u0136"+
    "\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1\0\u01f0\0\u020f\0\u022e"+
    "\0\u024d\0\u024d\0\76\0\u024d\0\u026c\0\u028b\0\u02aa\0\u024d"+
    "\0\u024d\0\u024d\0\u02c9\0\u02e8\0\u0307\0\u024d\0\u0326\0\u0345"+
    "\0\u0364\0\u0383\0\u03a2\0\u03c1\0\u03e0\0\u03ff\0\u041e\0\u043d"+
    "\0\76\0\76\0\76\0\u045c\0\u047b\0\76\0\u049a\0\u04b9"+
    "\0\76\0\76\0\76\0\76\0\76\0\76\0\u04d8\0\u04f7"+
    "\0\76\0\u04d8\0\u024d\0\u024d\0\u024d\0\u0516\0\u0535\0\u047b"+
    "\0\u024d\0\u0554\0\u0573\0\u024d\0\u024d\0\u024d\0\u024d\0\u024d"+
    "\0\u024d\0\u0592\0\u05b1\0\u024d\0\u0592\0\76\0\u05d0\0\u05ef"+
    "\0\u060e\0\u024d\0\u062d\0\u064c\0\u066b\0\u068a\0\u06a9\0\u06c8"+
    "\0\u06e7\0\u0706\0\u04d8\0\u0725\0\u0592\0\u0706\0\u0725";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\3\24\1\25\1\26\1\27\2\24"+
    "\1\30\2\24\1\31\1\32\1\33\1\34\1\32\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\3\54\1\55"+
    "\1\56\1\57\2\54\1\60\2\54\44\0\1\61\12\0"+
    "\1\62\24\0\1\63\5\0\2\64\6\0\2\64\11\0"+
    "\37\65\13\0\1\66\23\0\2\67\3\0\7\67\2\70"+
    "\21\67\14\0\2\15\41\0\1\71\36\0\1\72\36\0"+
    "\1\73\40\0\1\74\37\0\1\75\27\0\2\76\6\0"+
    "\4\77\1\0\1\76\5\77\14\0\2\76\6\0\4\77"+
    "\1\0\1\76\4\77\1\100\30\0\1\101\22\0\2\76"+
    "\6\0\4\76\1\0\6\76\14\0\2\76\6\0\4\77"+
    "\1\0\1\76\1\77\1\102\3\77\2\34\1\33\36\34"+
    "\1\33\2\34\1\103\12\34\1\104\20\34\1\33\3\34"+
    "\1\105\5\34\2\106\6\34\2\106\11\34\2\107\1\110"+
    "\34\107\2\34\1\33\10\34\1\111\23\34\2\112\1\33"+
    "\2\34\7\112\2\113\21\112\2\34\1\33\11\34\2\45"+
    "\23\34\1\33\15\34\1\114\20\34\1\33\15\34\1\115"+
    "\20\34\1\33\15\34\1\116\20\34\1\33\17\34\1\117"+
    "\16\34\1\33\20\34\1\120\15\34\1\33\11\34\2\121"+
    "\6\34\4\122\1\34\1\121\5\122\2\34\1\33\11\34"+
    "\2\121\6\34\4\122\1\34\1\121\4\122\1\123\2\34"+
    "\1\33\25\34\1\124\10\34\1\33\11\34\2\121\6\34"+
    "\4\121\1\34\6\121\2\34\1\33\11\34\2\121\6\34"+
    "\4\122\1\34\1\121\1\122\1\125\3\122\14\0\2\64"+
    "\6\0\2\64\20\0\1\126\43\0\2\127\35\0\2\130"+
    "\45\0\4\77\2\0\5\77\24\0\4\77\2\0\1\131"+
    "\4\77\2\34\1\33\11\34\2\106\6\34\2\106\13\34"+
    "\1\33\4\34\1\132\31\34\1\33\11\34\2\133\23\34"+
    "\1\33\11\34\2\134\23\34\1\33\21\34\4\122\2\34"+
    "\5\122\2\34\1\33\21\34\4\122\2\34\1\135\4\122"+
    "\14\0\2\127\7\0\1\136\25\0\2\130\7\0\1\136"+
    "\35\0\4\77\2\0\3\77\1\137\1\77\2\34\1\33"+
    "\11\34\2\133\7\34\1\140\13\34\1\33\11\34\2\134"+
    "\7\34\1\140\13\34\1\33\21\34\4\122\2\34\3\122"+
    "\1\141\1\122\11\0\2\142\50\0\4\77\2\0\4\77"+
    "\1\143\2\34\1\33\6\34\2\144\26\34\1\33\21\34"+
    "\4\122\2\34\4\122\1\145\14\0\2\146\21\0\2\34"+
    "\1\33\11\34\2\147\21\34";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\3\1\3\11\3\1\1\11\14\1\1\11"+
    "\1\0\24\1\3\11\1\1\1\0\1\11\1\0\1\1"+
    "\6\11\2\1\1\11\5\1\1\0\2\1\1\0\13\1"+
    "\1\11\7\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MPLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  private static String zzToPrintable(String str) {
    StringBuilder builder = new StringBuilder();
    for (int n = 0 ; n < str.length() ; ) {
      int ch = str.codePointAt(n);
      int charCount = Character.charCount(ch);
      n += charCount;
      if (ch > 31 && ch < 127) {
        builder.append((char)ch);
      } else if (charCount == 1) {
        builder.append(String.format("\\u%04X", ch));
      } else {
        builder.append(String.format("\\U%06X", ch));
      }
    }
    return builder.toString();
  }
  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [71] { if (yytext() != null && yytext().length() > 0) System.out.println( \"ERROR: \" + yytext() ); }");
            { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() );
            }
            // fall through
          case 27: break;
          case 2:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [30] { ; }");
            { ;
            }
            // fall through
          case 28: break;
          case 3:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [34] { return new Symbol( sym.MULTI); }");
            { return new Symbol( sym.MULTI);
            }
            // fall through
          case 29: break;
          case 4:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [33] { return new Symbol( sym.PLUS); }");
            { return new Symbol( sym.PLUS);
            }
            // fall through
          case 30: break;
          case 5:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [35] { return new Symbol( sym.MINUS); }");
            { return new Symbol( sym.MINUS);
            }
            // fall through
          case 31: break;
          case 6:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [36] { return new Symbol( sym.DIV); }");
            { return new Symbol( sym.DIV);
            }
            // fall through
          case 32: break;
          case 7:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [65] { return new Symbol( sym.CONST ); }");
            { return new Symbol( sym.CONST );
            }
            // fall through
          case 33: break;
          case 8:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [40] { return new Symbol( sym.COL ); }");
            { return new Symbol( sym.COL );
            }
            // fall through
          case 34: break;
          case 9:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [50] { return new Symbol( sym.LT ); }");
            { return new Symbol( sym.LT );
            }
            // fall through
          case 35: break;
          case 10:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [37] { return new Symbol( sym.ASSIGN); }");
            { return new Symbol( sym.ASSIGN);
            }
            // fall through
          case 36: break;
          case 11:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [48] { return new Symbol( sym.GT ); }");
            { return new Symbol( sym.GT );
            }
            // fall through
          case 37: break;
          case 12:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [61] { return new Symbol(sym.ID); }");
            { return new Symbol(sym.ID);
            }
            // fall through
          case 38: break;
          case 13:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [28] { yybegin( YYINITIAL ); }");
            { yybegin( YYINITIAL );
            }
            // fall through
          case 39: break;
          case 14:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [41] { return new Symbol( sym.FS ); }");
            { return new Symbol( sym.FS );
            }
            // fall through
          case 40: break;
          case 15:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [53] { return new Symbol( sym.NE ); }");
            { return new Symbol( sym.NE );
            }
            // fall through
          case 41: break;
          case 16:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [45] { return new Symbol( sym.CS ); }");
            { return new Symbol( sym.CS );
            }
            // fall through
          case 42: break;
          case 17:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [27] { yybegin( COMMENT ); }");
            { yybegin( COMMENT );
            }
            // fall through
          case 43: break;
          case 18:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [51] { return new Symbol( sym.LTE ); }");
            { return new Symbol( sym.LTE );
            }
            // fall through
          case 44: break;
          case 19:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [52] { return new Symbol( sym.E ); }");
            { return new Symbol( sym.E );
            }
            // fall through
          case 45: break;
          case 20:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [49] { return new Symbol( sym.GTE ); }");
            { return new Symbol( sym.GTE );
            }
            // fall through
          case 46: break;
          case 21:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [43] { return new Symbol( sym.CB ); }");
            { return new Symbol( sym.CB );
            }
            // fall through
          case 47: break;
          case 22:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [42] { return new Symbol( sym.FE ); }");
            { return new Symbol( sym.FE );
            }
            // fall through
          case 48: break;
          case 23:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [44] { return new Symbol( sym.EOL) ; }");
            { return new Symbol( sym.EOL) ;
            }
            // fall through
          case 49: break;
          case 24:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [58] { return new Symbol( sym.IF ); }");
            { return new Symbol( sym.IF );
            }
            // fall through
          case 50: break;
          case 25:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [68] { return new Symbol( sym.CONST); }");
            { return new Symbol( sym.CONST);
            }
            // fall through
          case 51: break;
          case 26:
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [57] { return new Symbol( sym.START ); }");
            { return new Symbol( sym.START );
            }
            // fall through
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java MPLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        MPLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new MPLexer(reader);
          do {
            System.out.println(scanner.next_token());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}