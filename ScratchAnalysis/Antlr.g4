// Derived from http://json.org
grammar Antlr;

json
   : value
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
    : STRING ':' value
    | costumes
    | sounds
    | broadcasts
    | blocks
    | comments
//    | TARGETS':' value
//    | EXTENSIONS ':' value
//    | META ':' value
    ;

value
   : STRING
   | NUMBER
   | obj
   | array
   | 'true'
   | 'false'
   | 'null'
//   | blocks_event
//   | blocks_control
//   | procedures_definition
   ;
//TARGETS
//   :'"targets"'
//   ;
//EXTENSIONS
//   :'"extensions"'
//   ;
//META
//   :'"meta"'
//   ;
array
   :  '[' value (',' value)* ']'
   | '[' ']'
   ;

costumes
   :'"costumes"' ':''[' costume_content(','costume_content )*']'
   |'"costumes"' ':' '{''}'
   ;
costume_content
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;
sounds
   :'"sounds"' ':' '[' sound_content(',' sound_content)*']'
   |'"sounds"' ':' '{''}'
   ;
sound_content
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

broadcasts
   :'"broadcasts"' ':' '{' '}'
   |'"broadcasts"' ':' '{'broadcast_content(','broadcast_content)* '}'
   ;
broadcast_content
   : STRING ':' value
   ;

blocks
   :'"blocks"' ':' '{' '}'
   |'"blocks"' ':' '{'block_content(','block_content)* '}'
   ;
block_content
   : STRING ':' value
   ;

comments
   :'"comments"' ':' '{' '}'
   |'"comments"' ':' '{'comment_content(','comment_content)* '}'
   ;
comment_content
   : STRING ':' value
   ;


//blocks_event
//   : event_whenflagclicked
//   | event_whenthisspriteclicked
//   | event_whenkeypressed
//   | event_whenbackdropswitchesto
//   | event_whengreaterthan
//   | event_whenbroadcastreceived
//   | event_broadcast
//   | event_broadcastandwait
//   ;
//
//blocks_control
//   : control_wait
//   | control_repeat
//   | control_forever
//   | control_if_else
//   | control_wait_until
//   | control_repeat_until
//   | control_stop
//   | control_start_as_clone
//   | control_create_clone_of
//   | control_create_clone_of_menu
//   | control_delete_this_clone
//   ;

//event_whenflagclicked
//   :'"event_whenflagclicked"'
//   ;
//event_whenthisspriteclicked
//   :'"event_whenthisspriteclicked"'
//   ;
//event_whenkeypressed
//   :'"event_whenkeypressed"'
//   ;
//event_whenbackdropswitchesto
//   :'"event_whenbackdropswitchesto"'
//   ;
//event_whengreaterthan
//   :'"event_whengreaterthan"'
//   ;
//event_whenbroadcastreceived
//   :'"event_whenbroadcastreceived"'
//   ;
//event_broadcast
//   :'"event_broadcast"'
//   ;
//event_broadcastandwait
//   :'"event_broadcastandwait"'
//   ;
//
//control_wait
//   :'"control_wait"'
//   ;
//control_repeat
//   :'"control_repeat"'
//   ;
//control_forever
//   :'"control_forever"'
//   ;
//control_if_else
//   :'"control_if_else"'
//   ;
//control_wait_until
//   :'"control_wait_until"'
//   ;
//control_repeat_until
//   :'"control_repeat_until"'
//   ;
//control_stop
//   :'"control_stop"'
//   ;
//control_start_as_clone
//   :'"control_start_as_clone"'
//   ;
//control_create_clone_of
//   :'"control_create_clone_of"'
//   ;
//control_create_clone_of_menu
//   :'"control_create_clone_of_menu"'
//   ;
//control_delete_this_clone
//   :'"control_delete_this_clone"'
//   ;
//
//procedures_definition
//   :'"procedures_definition"'
//   ;
STRING
   : '"' (ESC | ~ ["\\])* '"'
   ;

fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;
NUMBER
   : '-'? INT ('.' [0-9] +)? EXP ?
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros
fragment EXP
   : [Ee] [+\-]? INT+
   ;
// \- since - means "range" inside [...]
WS
   : [ \t\n\r] + -> skip
   ;