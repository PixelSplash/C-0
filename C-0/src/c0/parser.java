
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package c0;

import java_cup.runtime.*;
import tree.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\005\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\015\000\002\003" +
    "\011\000\002\003\011\000\002\003\010\000\002\003\007" +
    "\000\002\003\004\000\002\003\007\000\002\003\003\000" +
    "\002\003\003\000\002\003\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\026\020\012\021\006\023\004\024\016\032" +
    "\010\033\013\034\014\035\017\036\005\037\007\001\002" +
    "\000\004\037\106\001\002\000\062\002\uffeb\004\uffeb\005" +
    "\uffeb\006\uffeb\007\uffeb\011\uffeb\012\uffeb\013\uffeb\014\uffeb" +
    "\015\uffeb\016\uffeb\020\uffeb\021\uffeb\023\uffeb\024\uffeb\025" +
    "\uffeb\027\uffeb\031\uffeb\032\uffeb\033\uffeb\034\uffeb\035\uffeb" +
    "\036\uffeb\037\uffeb\001\002\000\004\024\100\001\002\000" +
    "\062\002\uffec\004\uffec\005\uffec\006\uffec\007\uffec\011\uffec" +
    "\012\uffec\013\uffec\014\uffec\015\uffec\016\uffec\020\uffec\021" +
    "\uffec\023\uffec\024\uffec\025\uffec\027\uffec\031\uffec\032\uffec" +
    "\033\uffec\034\uffec\035\uffec\036\uffec\037\uffec\001\002\000" +
    "\004\024\073\001\002\000\030\002\072\020\012\021\006" +
    "\023\004\024\016\032\010\033\013\034\014\035\017\036" +
    "\005\037\007\001\002\000\004\024\057\001\002\000\004" +
    "\024\053\001\002\000\004\024\047\001\002\000\056\002" +
    "\uffff\004\027\005\022\006\033\007\030\011\034\012\023" +
    "\013\026\014\024\015\025\016\031\020\uffff\021\uffff\023" +
    "\uffff\024\uffff\027\uffff\032\uffff\033\uffff\034\uffff\035\uffff" +
    "\036\uffff\037\uffff\001\002\000\026\020\012\021\006\023" +
    "\004\024\016\032\010\033\013\034\014\035\017\036\005" +
    "\037\007\001\002\000\004\031\020\001\002\000\062\002" +
    "\uffee\004\uffee\005\uffee\006\uffee\007\uffee\011\uffee\012\uffee" +
    "\013\uffee\014\uffee\015\uffee\016\uffee\020\uffee\021\uffee\023" +
    "\uffee\024\uffee\025\uffee\027\uffee\031\uffee\032\uffee\033\uffee" +
    "\034\uffee\035\uffee\036\uffee\037\uffee\001\002\000\030\004" +
    "\027\005\022\006\033\007\030\011\034\012\023\013\026" +
    "\014\024\015\025\016\031\025\032\001\002\000\026\020" +
    "\012\021\006\023\004\024\016\032\010\033\013\034\014" +
    "\035\017\036\005\037\007\001\002\000\026\020\012\021" +
    "\006\023\004\024\016\032\010\033\013\034\014\035\017" +
    "\036\005\037\007\001\002\000\026\020\012\021\006\023" +
    "\004\024\016\032\010\033\013\034\014\035\017\036\005" +
    "\037\007\001\002\000\026\020\012\021\006\023\004\024" +
    "\016\032\010\033\013\034\014\035\017\036\005\037\007" +
    "\001\002\000\026\020\012\021\006\023\004\024\016\032" +
    "\010\033\013\034\014\035\017\036\005\037\007\001\002" +
    "\000\026\020\012\021\006\023\004\024\016\032\010\033" +
    "\013\034\014\035\017\036\005\037\007\001\002\000\026" +
    "\020\012\021\006\023\004\024\016\032\010\033\013\034" +
    "\014\035\017\036\005\037\007\001\002\000\026\020\012" +
    "\021\006\023\004\024\016\032\010\033\013\034\014\035" +
    "\017\036\005\037\007\001\002\000\062\002\ufffa\004\ufffa" +
    "\005\ufffa\006\ufffa\007\ufffa\011\ufffa\012\ufffa\013\ufffa\014" +
    "\ufffa\015\ufffa\016\ufffa\020\ufffa\021\ufffa\023\ufffa\024\ufffa" +
    "\025\ufffa\027\ufffa\031\ufffa\032\ufffa\033\ufffa\034\ufffa\035" +
    "\ufffa\036\ufffa\037\ufffa\001\002\000\026\020\012\021\006" +
    "\023\004\024\016\032\010\033\013\034\014\035\017\036" +
    "\005\037\007\001\002\000\026\020\012\021\006\023\004" +
    "\024\016\032\010\033\013\034\014\035\017\036\005\037" +
    "\007\001\002\000\062\002\ufff6\004\027\005\022\006\033" +
    "\007\030\011\ufff6\012\ufff6\013\026\014\024\015\025\016" +
    "\031\020\ufff6\021\ufff6\023\ufff6\024\ufff6\025\ufff6\027\ufff6" +
    "\031\ufff6\032\ufff6\033\ufff6\034\ufff6\035\ufff6\036\ufff6\037" +
    "\ufff6\001\002\000\062\002\ufffc\004\ufffc\005\ufffc\006\ufffc" +
    "\007\ufffc\011\ufffc\012\ufffc\013\ufffc\014\ufffc\015\ufffc\016" +
    "\ufffc\020\ufffc\021\ufffc\023\ufffc\024\ufffc\025\ufffc\027\ufffc" +
    "\031\ufffc\032\ufffc\033\ufffc\034\ufffc\035\ufffc\036\ufffc\037" +
    "\ufffc\001\002\000\062\002\ufff8\004\027\005\022\006\033" +
    "\007\030\011\ufff8\012\ufff8\013\ufff8\014\ufff8\015\ufff8\016" +
    "\ufff8\020\ufff8\021\ufff8\023\ufff8\024\ufff8\025\ufff8\027\ufff8" +
    "\031\ufff8\032\ufff8\033\ufff8\034\ufff8\035\ufff8\036\ufff8\037" +
    "\ufff8\001\002\000\062\002\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\007\ufffb\011\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016" +
    "\ufffb\020\ufffb\021\ufffb\023\ufffb\024\ufffb\025\ufffb\027\ufffb" +
    "\031\ufffb\032\ufffb\033\ufffb\034\ufffb\035\ufffb\036\ufffb\037" +
    "\ufffb\001\002\000\062\002\ufffe\004\ufffe\005\ufffe\006\033" +
    "\007\030\011\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016" +
    "\ufffe\020\ufffe\021\ufffe\023\ufffe\024\ufffe\025\ufffe\027\ufffe" +
    "\031\ufffe\032\ufffe\033\ufffe\034\ufffe\035\ufffe\036\ufffe\037" +
    "\ufffe\001\002\000\062\002\ufff5\004\027\005\022\006\033" +
    "\007\030\011\ufff5\012\ufff5\013\ufff5\014\ufff5\015\025\016" +
    "\031\020\ufff5\021\ufff5\023\ufff5\024\ufff5\025\ufff5\027\ufff5" +
    "\031\ufff5\032\ufff5\033\ufff5\034\ufff5\035\ufff5\036\ufff5\037" +
    "\ufff5\001\002\000\062\002\ufff9\004\027\005\022\006\033" +
    "\007\030\011\ufff9\012\ufff9\013\ufff9\014\ufff9\015\ufff9\016" +
    "\ufff9\020\ufff9\021\ufff9\023\ufff9\024\ufff9\025\ufff9\027\ufff9" +
    "\031\ufff9\032\ufff9\033\ufff9\034\ufff9\035\ufff9\036\ufff9\037" +
    "\ufff9\001\002\000\062\002\ufff4\004\027\005\022\006\033" +
    "\007\030\011\ufff4\012\ufff4\013\ufff4\014\ufff4\015\025\016" +
    "\031\020\ufff4\021\ufff4\023\ufff4\024\ufff4\025\ufff4\027\ufff4" +
    "\031\ufff4\032\ufff4\033\ufff4\034\ufff4\035\ufff4\036\ufff4\037" +
    "\ufff4\001\002\000\062\002\ufff7\004\027\005\022\006\033" +
    "\007\030\011\ufff7\012\ufff7\013\026\014\024\015\025\016" +
    "\031\020\ufff7\021\ufff7\023\ufff7\024\ufff7\025\ufff7\027\ufff7" +
    "\031\ufff7\032\ufff7\033\ufff7\034\ufff7\035\ufff7\036\ufff7\037" +
    "\ufff7\001\002\000\062\002\ufffd\004\ufffd\005\ufffd\006\033" +
    "\007\030\011\ufffd\012\ufffd\013\ufffd\014\ufffd\015\ufffd\016" +
    "\ufffd\020\ufffd\021\ufffd\023\ufffd\024\ufffd\025\ufffd\027\ufffd" +
    "\031\ufffd\032\ufffd\033\ufffd\034\ufffd\035\ufffd\036\ufffd\037" +
    "\ufffd\001\002\000\004\040\050\001\002\000\004\025\051" +
    "\001\002\000\004\031\052\001\002\000\062\002\uffea\004" +
    "\uffea\005\uffea\006\uffea\007\uffea\011\uffea\012\uffea\013\uffea" +
    "\014\uffea\015\uffea\016\uffea\020\uffea\021\uffea\023\uffea\024" +
    "\uffea\025\uffea\027\uffea\031\uffea\032\uffea\033\uffea\034\uffea" +
    "\035\uffea\036\uffea\037\uffea\001\002\000\026\020\012\021" +
    "\006\023\004\024\016\032\010\033\013\034\014\035\017" +
    "\036\005\037\007\001\002\000\030\004\027\005\022\006" +
    "\033\007\030\011\034\012\023\013\026\014\024\015\025" +
    "\016\031\025\055\001\002\000\004\031\056\001\002\000" +
    "\062\002\uffef\004\uffef\005\uffef\006\uffef\007\uffef\011\uffef" +
    "\012\uffef\013\uffef\014\uffef\015\uffef\016\uffef\020\uffef\021" +
    "\uffef\023\uffef\024\uffef\025\uffef\027\uffef\031\uffef\032\uffef" +
    "\033\uffef\034\uffef\035\uffef\036\uffef\037\uffef\001\002\000" +
    "\026\020\012\021\006\023\004\024\016\032\010\033\013" +
    "\034\014\035\017\036\005\037\007\001\002\000\030\004" +
    "\027\005\022\006\033\007\030\011\034\012\023\013\026" +
    "\014\024\015\025\016\031\025\061\001\002\000\004\026" +
    "\062\001\002\000\026\020\012\021\006\023\004\024\016" +
    "\032\010\033\013\034\014\035\017\036\005\037\007\001" +
    "\002\000\030\020\012\021\006\023\004\024\016\027\064" +
    "\032\010\033\013\034\014\035\017\036\005\037\007\001" +
    "\002\000\064\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2" +
    "\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\020" +
    "\ufff2\021\ufff2\022\066\023\ufff2\024\ufff2\025\ufff2\027\ufff2" +
    "\031\ufff2\032\ufff2\033\ufff2\034\ufff2\035\ufff2\036\ufff2\037" +
    "\ufff2\001\002\000\056\002\001\004\027\005\022\006\033" +
    "\007\030\011\034\012\023\013\026\014\024\015\025\016" +
    "\031\020\001\021\001\023\001\024\001\027\001\032\001" +
    "\033\001\034\001\035\001\036\001\037\001\001\002\000" +
    "\004\026\067\001\002\000\026\020\012\021\006\023\004" +
    "\024\016\032\010\033\013\034\014\035\017\036\005\037" +
    "\007\001\002\000\030\020\012\021\006\023\004\024\016" +
    "\027\071\032\010\033\013\034\014\035\017\036\005\037" +
    "\007\001\002\000\062\002\ufff3\004\ufff3\005\ufff3\006\ufff3" +
    "\007\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016" +
    "\ufff3\020\ufff3\021\ufff3\023\ufff3\024\ufff3\025\ufff3\027\ufff3" +
    "\031\ufff3\032\ufff3\033\ufff3\034\ufff3\035\ufff3\036\ufff3\037" +
    "\ufff3\001\002\000\004\002\000\001\002\000\004\025\074" +
    "\001\002\000\004\026\075\001\002\000\026\020\012\021" +
    "\006\023\004\024\016\032\010\033\013\034\014\035\017" +
    "\036\005\037\007\001\002\000\030\020\012\021\006\023" +
    "\004\024\016\027\077\032\010\033\013\034\014\035\017" +
    "\036\005\037\007\001\002\000\062\002\ufff0\004\ufff0\005" +
    "\ufff0\006\ufff0\007\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\015\ufff0\016\ufff0\020\ufff0\021\ufff0\023\ufff0\024\ufff0\025" +
    "\ufff0\027\ufff0\031\ufff0\032\ufff0\033\ufff0\034\ufff0\035\ufff0" +
    "\036\ufff0\037\ufff0\001\002\000\026\020\012\021\006\023" +
    "\004\024\016\032\010\033\013\034\014\035\017\036\005" +
    "\037\007\001\002\000\030\004\027\005\022\006\033\007" +
    "\030\011\034\012\023\013\026\014\024\015\025\016\031" +
    "\025\102\001\002\000\004\026\103\001\002\000\026\020" +
    "\012\021\006\023\004\024\016\032\010\033\013\034\014" +
    "\035\017\036\005\037\007\001\002\000\030\020\012\021" +
    "\006\023\004\024\016\027\105\032\010\033\013\034\014" +
    "\035\017\036\005\037\007\001\002\000\062\002\ufff1\004" +
    "\ufff1\005\ufff1\006\ufff1\007\ufff1\011\ufff1\012\ufff1\013\ufff1" +
    "\014\ufff1\015\ufff1\016\ufff1\020\ufff1\021\ufff1\023\ufff1\024" +
    "\ufff1\025\ufff1\027\ufff1\031\ufff1\032\ufff1\033\ufff1\034\ufff1" +
    "\035\ufff1\036\ufff1\037\ufff1\001\002\000\004\010\107\001" +
    "\002\000\026\020\012\021\006\023\004\024\016\032\010" +
    "\033\013\034\014\035\017\036\005\037\007\001\002\000" +
    "\030\004\027\005\022\006\033\007\030\011\034\012\023" +
    "\013\026\014\024\015\025\016\031\031\111\001\002\000" +
    "\062\002\uffed\004\uffed\005\uffed\006\uffed\007\uffed\011\uffed" +
    "\012\uffed\013\uffed\014\uffed\015\uffed\016\uffed\020\uffed\021" +
    "\uffed\023\uffed\024\uffed\025\uffed\027\uffed\031\uffed\032\uffed" +
    "\033\uffed\034\uffed\035\uffed\036\uffed\037\uffed\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\006\002\010\003\014\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\064\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\045\001\001\000\004" +
    "\003\044\001\001\000\004\003\043\001\001\000\004\003" +
    "\042\001\001\000\004\003\041\001\001\000\004\003\040" +
    "\001\001\000\004\003\037\001\001\000\004\003\036\001" +
    "\001\000\002\001\001\000\004\003\035\001\001\000\004" +
    "\003\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\053\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\002\062\003\014\001\001\000\004\003\064" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\002\067\003\014\001\001\000\004\003\064" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\002\075\003\014\001\001" +
    "\000\004\003\064\001\001\000\002\001\001\000\004\003" +
    "\100\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\002\103\003\014\001\001\000\004\003\064\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\107\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    int directionCount = 0;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new MultiExp(e,e1, 1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree start_val = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new MultiExp(e,e, 0); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr PLUS expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Plus(e1, e2); RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr MINUS expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Minus(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr MUL expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Multiply(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr DIV expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Divide(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= LPAREN expr RPAREN 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e;  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr MINOR expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Minor(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr MAYOR expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Mayor(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr AND expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new And(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr OR expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Or(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr EQUAL expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Equal(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr NOTEQUAL expr 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Notequal(e1, e2);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= IF LPAREN expr RPAREN LBRACKET expr_list RBRACKET ELSE LBRACKET expr_list RBRACKET 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e2 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new If(e, e1, e2, 1);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= IF LPAREN expr RPAREN LBRACKET expr_list RBRACKET 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new If(e, e1, e1, 0);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= WHILE LPAREN expr RPAREN LBRACKET expr_list RBRACKET 
            {
              Tree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new While(e,e1);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= MAIN LPAREN RPAREN LBRACKET expr_list RBRACKET 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Main(e1);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= PUTW LPAREN expr RPAREN SEMICOLON 
            {
              Tree RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Tree e1 = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new Putw(e1);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= BREAK SEMICOLON 
            {
              Tree RESULT =null;
		 RESULT = new Break();  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= INTT IDENT ASSIGN expr SEMICOLON 
            {
              Tree RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Tree e = (Tree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Assignment(s, e, 0);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= IDENT 
            {
              Tree RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Identifier(s);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= INT 
            {
              Tree RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Literal(n);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= PUTS LPAREN STRING RPAREN SEMICOLON 
            {
              Tree RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new Puts(s);  RESULT.setDirection(directionCount); directionCount++; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
