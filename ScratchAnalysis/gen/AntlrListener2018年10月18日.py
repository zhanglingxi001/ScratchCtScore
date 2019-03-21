# Generated from C:/Users/XIXI/Desktop/ScratchAnalysis\Antlr.g4 by ANTLR 4.7
from antlr4 import *
import json
if __name__ is not None and "." in __name__:
    from .AntlrParser import AntlrParser
else:
    from AntlrParser import AntlrParser

# This class defines a complete listener for a parse tree produced by AntlrParser.
class AntlrListener(ParseTreeListener):
    def __init__(self):
        self.deadcode_flag = False
        self.max_depth = 0  # 语法树的最大深度
        self.max_if_depth = 0  # 最大if语句的深度
        self.max_until_depth = 0  # 最大until语句的深度
        self.max_repeat_depth = 0  # 最大repeat语句的深度
        self.if_count = 0  # if语句的数量
        self.until_count = 0  # until语句的数量
        self.repeat_count = 0  # repeat语句的数量
        self.scripts_count = 0  # 脚本语句scripts的数量
        self.comments_count = 0  # 代码评论的数目
        self.depth = 0  # 总深度
        self.if_depth = 0  # if语句的深度
        self.until_depth = 0  # until语句的深度
        self.repeat_depth = 0  # repeat语句的深度
        self.proj_count = 0  # 自定义函数proj的数目
        self.costumes_count = 0  # 角色costumes的数目
        self.wg_count = 0  # 小绿旗子的数目
        self.clone_count = 0  # clone语句的数目
        self.whenclick_count = 0  # 鼠标点击事件的数目
        self.whenkey_count = 0  # 键盘输入事件的数目
        self.whdrop_count = 0  # 背景切换的数目
        self.whreceive_count = 0  # 接收信号模块的数目
        self.whsensor_count = 0  # 输入音频视频的数目
        self.deadcode_count = 0  # 死代码块的数目
        self.missing_startup_count = 0  # 缺少启动语句block数目
        self.broadcastlist = []  # 广播发送的所有内容
        self.receivelist = []  # 广播接收的所有内容
        self.Meaningless_count = 0  # 无效命名数目
        self.initit = 0  # 是否初始化的标志
        self.attributeInitit = 0  # 角色属性初始化标志
        self.Recursively = 0  # 递归的数目
        self.SayandSound = 0  # 声画匹配的标志
        self.backgroud = 0  # 背景的数目
        self.sound_use = 0  # 使用音乐的次数
        self.instrument_use = 0  # 使用乐器的次数
        self.sprit_costume = 0  # 是否切换了造型
        # self.comments_count=0#是否切换了造型
        self.whenkey_countlist = []
        self.whenclick_countlist = []
        self.whenscene_countlist = []
        self.whenireceive_countlist = []
        self.whensensor_countlist = []

        self.motionnum = 0  # 动作类模块
        self.looklikenum = 0  # 外观类模块
        self.soundsnum = 0  # 声音类模块
        self.drawnum = 0  # 画笔类模块
        self.when_count = 0  # 事件类模块
        self.control_count = 0  # 控制类模块
        self.sensor_count = 0  # 测试类模块
        self.operate_count = 0  # 运算类模块
        self.more_count = 0  # 更多类模块
        self.data_count = 0  # 数据类模块

        self.ap_score = 0  # Abstraction and problem decomposition 得分
        self.Parallelism_score = 0  # Parallelism得分
        self.Synchronization = 0  # Synchronization得分
        self.FlowControl_score = 0  # FlowControl得分
        self.UserInteractivity = 0  # UserInteractivity得分
        self.LogicalThinking = 0  # LogicalThinking得分
        self.DataRepresentation = 1  # 因为太多了，默认先直接给1分.....
        self.CodeOrganization = 0  # 代码组织得分
        self.content = 0  # 作品内容得分

        self.score = {}
        self.hint = []
        self.Meaningless_list = []

        self.have_insert = False
        self.profile = {}

        self.isFirst = []
        self.first = []
        self.linkedList = []
        self.isQueue = []  # 判断是否存在队列
        self.isStack = []  # 判断是否存在栈
        self.log=[]  #记录打分的日志
        self.blocks=[]  #记录blocks中的各个脚本

    def create_score(self):#评分标准
        self.score['Abstraction'] = self.ap_score  # 抽象和问题解决
        self.score['Parallelism'] = self.Parallelism_score  # 并行
        self.score['LogicalThinking'] = self.LogicalThinking  # 逻辑思维
        self.score['Synchronization'] = self.Synchronization  # 同步
        self.score['FlowControl'] = self.FlowControl_score  # 顺序控制
        self.score['UserInteractivity'] = self.UserInteractivity  # 用户交互
        self.score['DataRepresentation'] = self.DataRepresentation  # 数据表示
        self.score['CodeOrganization'] = self.CodeOrganization  # 代码组织
        self.score['Content'] = self.content  # 内容
        self.score['Log'] = self.log    #打分记录

    def create_profile(self):
        self.profile['motions'] = self.motionnum
        self.profile['looklike'] = self.looklikenum
        self.profile['sounds'] = self.soundsnum
        self.profile['draw'] = self.drawnum
        self.profile['event'] = self.when_count
        self.profile['control'] = self.control_count
        self.profile['sensor'] = self.sensor_count
        self.profile['operate'] = self.operate_count
        self.profile['more'] = self.more_count
        self.profile['data'] = self.data_count
        self.profile['backdrop'] = self.backgroud
        self.profile['sprites'] = self.sprits_count
        # self.profile['snduse'] = self.sound_use

    def print_all(self):
        # ---------------------------------------------------------------------
        # print("max_depth:", self.max_depth)
        # print("max_if_depth:", self.max_if_depth)
        # print("max_until_depth:", self.max_until_depth)
        # print("max_repeat_depth:", self.max_repeat_depth)
        # print("if_count:", self.if_count)
        # print("until_count:", self.until_count)
        # print("repeat_count:", self.repeat_count)
        # print("scripts_count:", self.scripts_count)
        # print("comments_count:", self.comments_count)
        # print("proj_count:", self.proj_count)
        # print("sprits_count:", self.sprits_count)
        # print("deadcode_count:", self.deadcode_count)
        # ---------------------------------------------------------------------
        self.create_score()
        #self.create_profile()
        print(self.score)




########################################################################################

    # Enter a parse tree produced by AntlrParser#json.
    def enterJson(self, ctx:AntlrParser.JsonContext):
        pass

    # Exit a parse tree produced by AntlrParser#json.
    def exitJson(self, ctx:AntlrParser.JsonContext):
        self.create_score()
        pass


    # Enter a parse tree produced by AntlrParser#obj.
    def enterObj(self, ctx:AntlrParser.ObjContext):
        pass

    # Exit a parse tree produced by AntlrParser#obj.
    def exitObj(self, ctx:AntlrParser.ObjContext):
        pass


    # Enter a parse tree produced by AntlrParser#pair.
    def enterPair(self, ctx:AntlrParser.PairContext):
        pass

    # Exit a parse tree produced by AntlrParser#pair.
    def exitPair(self, ctx:AntlrParser.PairContext):
        pass


    # Enter a parse tree produced by AntlrParser#value.
    def enterValue(self, ctx:AntlrParser.ValueContext):
        pass

    # Exit a parse tree produced by AntlrParser#value.
    def exitValue(self, ctx:AntlrParser.ValueContext):
        pass


    # Enter a parse tree produced by AntlrParser#array.
    def enterArray(self, ctx:AntlrParser.ArrayContext):
        pass

    # Exit a parse tree produced by AntlrParser#array.
    def exitArray(self, ctx:AntlrParser.ArrayContext):
        pass


    # Enter a parse tree produced by AntlrParser#costumes.
    def enterCostumes(self, ctx:AntlrParser.CostumesContext):
        pass

    # Exit a parse tree produced by AntlrParser#costumes.
    def exitCostumes(self, ctx:AntlrParser.CostumesContext):
        pass


    # Enter a parse tree produced by AntlrParser#costume_content.
    def enterCostume_content(self, ctx:AntlrParser.Costume_contentContext):
        self.costumes_count += 1  # 角色数目+1
        # 评分标准1-2
        if self.costumes_count > 1 and self.ap_score < 2:
            self.ap_score = 2
            self.log.append("1-2 抽象和问题分解 2分")
            #print(self.log)
        pass
        pass

    # Exit a parse tree produced by AntlrParser#costume_content.
    def exitCostume_content(self, ctx:AntlrParser.Costume_contentContext):
        pass


    # Enter a parse tree produced by AntlrParser#sounds.
    def enterSounds(self, ctx:AntlrParser.SoundsContext):
        pass

    # Exit a parse tree produced by AntlrParser#sounds.
    def exitSounds(self, ctx:AntlrParser.SoundsContext):
        pass


    # Enter a parse tree produced by AntlrParser#sound_content.
    def enterSound_content(self, ctx:AntlrParser.Sound_contentContext):
        pass

    # Exit a parse tree produced by AntlrParser#sound_content.
    def exitSound_content(self, ctx:AntlrParser.Sound_contentContext):
        pass


    # Enter a parse tree produced by AntlrParser#broadcasts.
    def enterBroadcasts(self, ctx:AntlrParser.BroadcastsContext):
        pass

    # Exit a parse tree produced by AntlrParser#broadcasts.
    def exitBroadcasts(self, ctx:AntlrParser.BroadcastsContext):
        pass


    # Enter a parse tree produced by AntlrParser#broadcast_content.
    def enterBroadcast_content(self, ctx:AntlrParser.Broadcast_contentContext):
        pass

    # Exit a parse tree produced by AntlrParser#broadcast_content.
    def exitBroadcast_content(self, ctx:AntlrParser.Broadcast_contentContext):
        pass


    # Enter a parse tree produced by AntlrParser#blocks.
    def enterBlocks(self, ctx:AntlrParser.BlocksContext):
        pass

    # Exit a parse tree produced by AntlrParser#blocks.
    def exitBlocks(self, ctx:AntlrParser.BlocksContext):
        pass


    # Enter a parse tree produced by AntlrParser#block_content.
    def enterBlock_content(self, ctx:AntlrParser.Block_contentContext):
        # 评分标准1-1
        self.scripts_count += 1
        if self.scripts_count > 1 and self.ap_score < 1:
            self.ap_score = 1
            self.log.append("1-1 抽象和问题分解 1分")

        list1 = ctx.getText().split('"', 2)
        name=list1[1]
        para=json.loads(list1[2].strip(':'))
        script=[]
        script.append(name)
        script.append(para)
        self.blocks.append(script)
        pass

    # Exit a parse tree produced by AntlrParser#block_content.
    def exitBlock_content(self, ctx:AntlrParser.Block_contentContext):
        pass


    # Enter a parse tree produced by AntlrParser#comments.
    def enterComments(self, ctx:AntlrParser.CommentsContext):
        pass

    # Exit a parse tree produced by AntlrParser#comments.
    def exitComments(self, ctx:AntlrParser.CommentsContext):
        pass


    # Enter a parse tree produced by AntlrParser#comment_content.
    def enterComment_content(self, ctx:AntlrParser.Comment_contentContext):
        pass

    # Exit a parse tree produced by AntlrParser#comment_content.
    def exitComment_content(self, ctx:AntlrParser.Comment_contentContext):
        pass


    # Enter a parse tree produced by AntlrParser#blocks_event.
    def enterBlocks_event(self, ctx:AntlrParser.Blocks_eventContext):
        pass

    # Exit a parse tree produced by AntlrParser#blocks_event.
    def exitBlocks_event(self, ctx:AntlrParser.Blocks_eventContext):
        pass


    # Enter a parse tree produced by AntlrParser#blocks_control.
    def enterBlocks_control(self, ctx:AntlrParser.Blocks_controlContext):
        pass

    # Exit a parse tree produced by AntlrParser#blocks_control.
    def exitBlocks_control(self, ctx:AntlrParser.Blocks_controlContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whenflagclicked.
    def enterEvent_whenflagclicked(self, ctx:AntlrParser.Event_whenflagclickedContext):
        self.wg_count+=1
        if self.wg_count >= 2 and self.Parallelism_score == 0:
            self.Parallelism_score = 1
            self.log.append("2-1 并行 1分")
        pass

    # Exit a parse tree produced by AntlrParser#event_whenflagclicked.
    def exitEvent_whenflagclicked(self, ctx:AntlrParser.Event_whenflagclickedContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whenthisspriteclicked.
    def enterEvent_whenthisspriteclicked(self, ctx:AntlrParser.Event_whenthisspriteclickedContext):
        self.whenclick_count+=1
        if self.whenclick_count >= 2  and self.Parallelism_score < 2:
            self.Parallelism_score = 2
            self.log.append("2-2 并行 2分")
        pass

    # Exit a parse tree produced by AntlrParser#event_whenthisspriteclicked.
    def exitEvent_whenthisspriteclicked(self, ctx:AntlrParser.Event_whenthisspriteclickedContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whenkeypressed.
    def enterEvent_whenkeypressed(self, ctx:AntlrParser.Event_whenkeypressedContext):
        self.whenkey_count+=1
        if self.whenkey_count >= 2  and self.Parallelism_score < 2:
            self.Parallelism_score = 2
            self.log.append("2-2 并行 2分")
        pass

    # Exit a parse tree produced by AntlrParser#event_whenkeypressed.
    def exitEvent_whenkeypressed(self, ctx:AntlrParser.Event_whenkeypressedContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whenbackdropswitchesto.
    def enterEvent_whenbackdropswitchesto(self, ctx:AntlrParser.Event_whenbackdropswitchestoContext):
        pass

    # Exit a parse tree produced by AntlrParser#event_whenbackdropswitchesto.
    def exitEvent_whenbackdropswitchesto(self, ctx:AntlrParser.Event_whenbackdropswitchestoContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whengreaterthan.
    def enterEvent_whengreaterthan(self, ctx:AntlrParser.Event_whengreaterthanContext):
        pass

    # Exit a parse tree produced by AntlrParser#event_whengreaterthan.
    def exitEvent_whengreaterthan(self, ctx:AntlrParser.Event_whengreaterthanContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_whenbroadcastreceived.
    def enterEvent_whenbroadcastreceived(self, ctx:AntlrParser.Event_whenbroadcastreceivedContext):
        pass

    # Exit a parse tree produced by AntlrParser#event_whenbroadcastreceived.
    def exitEvent_whenbroadcastreceived(self, ctx:AntlrParser.Event_whenbroadcastreceivedContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_broadcast.
    def enterEvent_broadcast(self, ctx:AntlrParser.Event_broadcastContext):
        pass

    # Exit a parse tree produced by AntlrParser#event_broadcast.
    def exitEvent_broadcast(self, ctx:AntlrParser.Event_broadcastContext):
        pass


    # Enter a parse tree produced by AntlrParser#event_broadcastandwait.
    def enterEvent_broadcastandwait(self, ctx:AntlrParser.Event_broadcastandwaitContext):
        pass

    # Exit a parse tree produced by AntlrParser#event_broadcastandwait.
    def exitEvent_broadcastandwait(self, ctx:AntlrParser.Event_broadcastandwaitContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_wait.
    def enterControl_wait(self, ctx:AntlrParser.Control_waitContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_wait.
    def exitControl_wait(self, ctx:AntlrParser.Control_waitContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_repeat.
    def enterControl_repeat(self, ctx:AntlrParser.Control_repeatContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_repeat.
    def exitControl_repeat(self, ctx:AntlrParser.Control_repeatContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_forever.
    def enterControl_forever(self, ctx:AntlrParser.Control_foreverContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_forever.
    def exitControl_forever(self, ctx:AntlrParser.Control_foreverContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_if_else.
    def enterControl_if_else(self, ctx:AntlrParser.Control_if_elseContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_if_else.
    def exitControl_if_else(self, ctx:AntlrParser.Control_if_elseContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_wait_until.
    def enterControl_wait_until(self, ctx:AntlrParser.Control_wait_untilContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_wait_until.
    def exitControl_wait_until(self, ctx:AntlrParser.Control_wait_untilContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_repeat_until.
    def enterControl_repeat_until(self, ctx:AntlrParser.Control_repeat_untilContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_repeat_until.
    def exitControl_repeat_until(self, ctx:AntlrParser.Control_repeat_untilContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_stop.
    def enterControl_stop(self, ctx:AntlrParser.Control_stopContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_stop.
    def exitControl_stop(self, ctx:AntlrParser.Control_stopContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_start_as_clone.
    def enterControl_start_as_clone(self, ctx:AntlrParser.Control_start_as_cloneContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_start_as_clone.
    def exitControl_start_as_clone(self, ctx:AntlrParser.Control_start_as_cloneContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_create_clone_of.
    def enterControl_create_clone_of(self, ctx:AntlrParser.Control_create_clone_ofContext):
        # 评分标准1-4
        self.clone_count += 1
        if self.clone_count > 0 and self.ap_score < 4:
            self.ap_score = 4
            self.log.append("1-4抽象和问题分解 4分")
            #print(self.log)
        pass

    # Exit a parse tree produced by AntlrParser#control_create_clone_of.
    def exitControl_create_clone_of(self, ctx:AntlrParser.Control_create_clone_ofContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_create_clone_of_menu.
    def enterControl_create_clone_of_menu(self, ctx:AntlrParser.Control_create_clone_of_menuContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_create_clone_of_menu.
    def exitControl_create_clone_of_menu(self, ctx:AntlrParser.Control_create_clone_of_menuContext):
        pass


    # Enter a parse tree produced by AntlrParser#control_delete_this_clone.
    def enterControl_delete_this_clone(self, ctx:AntlrParser.Control_delete_this_cloneContext):
        pass

    # Exit a parse tree produced by AntlrParser#control_delete_this_clone.
    def exitControl_delete_this_clone(self, ctx:AntlrParser.Control_delete_this_cloneContext):
        pass


    # Enter a parse tree produced by AntlrParser#procedures_definition.
    def enterProcedures_definition(self, ctx:AntlrParser.Procedures_definitionContext):
        self.proj_count += 1
        self.more_count += 1
        if self.proj_count > 0 and self.ap_score < 3:
            self.ap_score = 3
            self.log.append("1-3 抽象和问题分解 3分")
            #print(self.log)
        pass

    # Exit a parse tree produced by AntlrParser#procedures_definition.
    def exitProcedures_definition(self, ctx:AntlrParser.Procedures_definitionContext):

        pass


