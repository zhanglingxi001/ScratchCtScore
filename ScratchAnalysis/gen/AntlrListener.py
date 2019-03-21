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
        self.ifelse_count = 0 # ifelse语句的数量
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
        self.whendrop_count = 0  # 背景切换的数目
        self.whenreceive_count = 0  # 接收信号模块的数目
        self.whensensor_count = 0  # 输入音频视频的数目
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
        self.math_operatelist=['operator_add','operator_subtract','operator_multiply','operator_divide','operator_mod','operator_round','operator_mathop']

        self.data_listoperate = ['data_addtolist', 'data_deleteoflist', 'data_deletealloflist', 'data_insertatlist',
                                 'data_replaceitemoflist', 'data_showlist', 'data_hidelist']

        self.whenkey_countlist ={}#初始化按键输入字典
        self.whenkey_countlist['space'] = 0
        self.whenkey_countlist['left arrow'] = 0
        self.whenkey_countlist['right arrow'] = 0
        self.whenkey_countlist['down arrow'] = 0
        self.whenkey_countlist['up arrow'] = 0
        self.whenkey_countlist['any'] = 0
        self.whenkey_countlist['a'] = 0
        self.whenkey_countlist['b'] = 0
        self.whenkey_countlist['c'] = 0
        self.whenkey_countlist['d'] = 0
        self.whenkey_countlist['e'] = 0
        self.whenkey_countlist['f'] = 0
        self.whenkey_countlist['g'] = 0
        self.whenkey_countlist['h'] = 0
        self.whenkey_countlist['i'] = 0
        self.whenkey_countlist['j'] = 0
        self.whenkey_countlist['k'] = 0
        self.whenkey_countlist['l'] = 0
        self.whenkey_countlist['m'] = 0
        self.whenkey_countlist['n'] = 0
        self.whenkey_countlist['o'] = 0
        self.whenkey_countlist['p'] = 0
        self.whenkey_countlist['q'] = 0
        self.whenkey_countlist['r'] = 0
        self.whenkey_countlist['s'] = 0
        self.whenkey_countlist['t'] = 0
        self.whenkey_countlist['u'] = 0
        self.whenkey_countlist['v'] = 0
        self.whenkey_countlist['w'] = 0
        self.whenkey_countlist['x'] = 0
        self.whenkey_countlist['y'] = 0
        self.whenkey_countlist['z'] = 0

        self.want_to_recive = []

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
        self.DataRepresentation = 0  # 数据表示得分
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
        self.log = []  # 记录打分的日志
        self.tempblocks=[] #临时存储blocks中的各个脚本
        self.blocks = []  # 记录blocks中的各个脚本
        self.variables = {} #记录定义的变量

    def create_score(self):  # 评分标准
        self.score['Abstraction'] = self.ap_score  # 抽象和问题解决
        self.score['Parallelism'] = self.Parallelism_score  # 并行
        self.score['LogicalThinking'] = self.LogicalThinking  # 逻辑思维
        self.score['Synchronization'] = self.Synchronization  # 同步
        self.score['FlowControl'] = self.FlowControl_score  # 顺序控制
        self.score['UserInteractivity'] = self.UserInteractivity  # 用户交互
        self.score['DataRepresentation'] = self.DataRepresentation  # 数据表示
        self.score['CodeOrganization'] = self.CodeOrganization  # 代码组织
        self.score['Content'] = self.content  # 内容
        self.score['Log'] = self.log  # 打分记录

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
        # self.create_profile()
        print(self.score)







    ########################################################################################
    # Enter a parse tree produced by AntlrParser#json.
    def enterJson(self, ctx:AntlrParser.JsonContext):
        pass

    # Exit a parse tree produced by AntlrParser#json.
    def exitJson(self, ctx:AntlrParser.JsonContext):

        # 评分标准8-4
        start_block_list = ['event_whenflagclicked', 'event_whenkeypressed', 'event_whenthisspriteclicked',
                            'event_whenbackdropswitchesto', 'event_whengreaterthan', 'event_whenbroadcastreceived',
                            'control_start_as_clone', 'videoSensing_whenMotionGreaterThan']
        for list in self.blocks:
            for dict in list:
                if dict['topLevel'] == True:
                    if dict['opcode'] not in start_block_list:
                        self.missing_startup_count += 1
                        break
        if self.missing_startup_count == 0 and self.CodeOrganization < 4:
            self.CodeOrganization = 4
            self.log.append("8-4代码组织 4分")

        # 评分标准8-5
        if len(self.receivelist) != 0:
            for bro in self.receivelist:
                if bro not in self.broadcastlist:
                    break
            else:
                if self.CodeOrganization < 5:
                    self.CodeOrganization = 5
                    self.log.append("8-5代码组织 5分")

        # 评分标准2-4
        print(self.want_to_recive)
        for wantlist in self.want_to_recive:
            if wantlist[1] >= 2 and self.Parallelism_score < 4:
                self.Parallelism_score = 4
                self.log.append("2-4并行 4分")

        self.create_score()
        # print((self.tempblocks))
        # print(len(self.blocks))
        pass


    # Enter a parse tree produced by AntlrParser#obj.
    def enterObj(self, ctx:AntlrParser.ObjContext):
        pass

    # Exit a parse tree produced by AntlrParser#obj.
    def exitObj(self, ctx:AntlrParser.ObjContext):
        pass


    # Enter a parse tree produced by AntlrParser#pair.
    def enterPair(self, ctx:AntlrParser.PairContext):
        #变量记录
        ctx_STRING = ctx.STRING()
        if ctx_STRING:
            ctx_STRING_Text = ctx_STRING.getText()
            if ctx_STRING_Text=='"variables"':
                if ctx.value().getText()!='{}':
                    self.variables=json.loads(ctx.value().getText())
                    #print(type(self.variables))
        pass

    # Exit a parse tree produced by AntlrParser#pair.
    def exitPair(self, ctx:AntlrParser.PairContext):
        pass


    # Enter a parse tree produced by AntlrParser#value.
    def enterValue(self, ctx:AntlrParser.ValueContext):
        #TODO value值的检测
        ctx_Text = ctx.getText()
        # 评分标准1-4
        if(ctx_Text == '"control_start_as_clone"'
            or ctx_Text == '"control_create_clone_of"'
            or ctx_Text == '"control_create_clone_of_menu"'
            or ctx_Text == '"control_delete_this_clone"'):
            self.clone_count += 1
            if self.clone_count > 0 and self.ap_score < 4:
                self.ap_score = 4
                self.log.append("1-4抽象和问题分解 4分")

        if ctx_Text == '"event_whenflagclicked"':
            self.wg_count += 1
            self.when_count += 1
            # 评分标准2-1
            if self.wg_count >= 1 and self.Parallelism_score == 0:
                self.Parallelism_score = 1
                self.log.append("2-1并行 1分")
            # 评分标准6-1
            if self.wg_count >= 1 and self.UserInteractivity == 0:
                self.UserInteractivity = 1
                self.log.append("6-1用户交互 1分")

        if ctx_Text == '"event_whenthisspriteclicked"':
            self.whenclick_count+=1
            # 评分标准2-2
            if self.whenclick_count >= 2 and self.Parallelism_score < 2:
                self.Parallelism_score = 2
                self.log.append("2-2并行 2分")
            # 评分标准6-2
            if self.UserInteractivity < 2:
                self.UserInteractivity = 2
                self.log.append("6-2用户交互 2分")

        if ctx_Text == '"event_whenbackdropswitchesto"':
            self.whendrop_count+=1
            # 评分标准2-3
            if self.whendrop_count >= 2 and self.Parallelism_score < 3:
                self.Parallelism_score = 3
                self.log.append("2-3并行 3分")

        if ctx_Text == '"videoSensing_whenMotionGreaterThan"':
            # 评分标准2-5
            self.whensensor_count += 1
            if self.whensensor_count >= 2 and self.Parallelism_score < 5:
                self.FlowControl_score = 5
                self.log.append('2-5并行 5分')

        if ctx_Text == '"control_if"':
            self.if_count += 1
            # 评分标准3-1
            if self.if_count >= 1 and self.LogicalThinking < 1:
                self.LogicalThinking = 1
                self.log.append("3-1逻辑思维 1分")

        if ctx_Text == '"control_if_else"':
            self.ifelse_count += 1
            # 评分标准3-2
            if self.ifelse_count >= 1 and self.LogicalThinking < 2:
                self.LogicalThinking = 2
                self.log.append("3-2逻辑思维 2分")

        if ctx_Text == '"control_wait"':
            # 评分标准4-1
            if self.Synchronization < 1:
                self.Synchronization = 1
                self.log.append('4-1同步 1分')

        if ctx_Text == '"event_whenbroadcastreceived"':
            # 评分标准4-2
            if self.Synchronization < 2:
                self.Synchronization = 2
                self.log.append('4-2同步 2分')

        if ctx_Text == '"event_whenkeypressed"':
            # 评分标准4-3
            if self.Synchronization < 3:
                self.Synchronization = 3
                self.log.append('4-3同步 3分')
            # 评分标准6-2
            if self.UserInteractivity < 2:
                self.UserInteractivity = 2
                self.log.append("6-2用户交互 2分")

        if ctx_Text == '"event_whenbackdropswitchesto"':
            # 评分标准4-4
            if self.Synchronization < 4:
                self.Synchronization = 4
                self.log.append('4-4同步 4分')

        if ctx_Text == '"control_wait_until"':
            # 评分标准4-5
            if self.Synchronization < 5:
                self.Synchronization = 5
                self.log.append('4-5同步 5分')

        if ctx_Text == '"control_forever"':
            # 评分标准5-2
            if self.FlowControl_score < 3:
                self.FlowControl_score = 2
                self.log.append('5-2顺序控制 2分')

        if ctx_Text == '"control_repeat_until"':
            # 评分标准5-2
            if self.FlowControl_score < 3:
                self.FlowControl_score = 3
                self.log.append('5-3顺序控制 3分')

        if ctx_Text == '"sensing_askandwait"':
            # 评分标准6-3
            self.sensor_count += 1
            if self.UserInteractivity < 3:
                self.UserInteractivity = 3
                self.log.append('6-3用户交互 3分')

        if ctx_Text == '"event_whengreaterthan"':
            # 评分标准6-4
            if self.UserInteractivity < 4:
                self.UserInteractivity = 4
                self.log.append('6-4用户交互 4分')

        if ctx_Text == '"videoSensing_menu_VIDEO_STATE"':
            # 评分标准6-5
            if self.UserInteractivity < 5:
                self.UserInteractivity = 5
                self.log.append('6-5用户交互 5分')

        if ctx_Text == '"looks_switchcostumeto"' or ctx_Text == '"looks_nextcostume"':
            # 评分标准7-1
            if self.DataRepresentation < 1:
                self.DataRepresentation = 1
                self.log.append('7-1数据表示 1分')

            # 评分标准9-2
            if self.content < 2:
                self.content = 2
                self.log.append("9-2内容 1分")

        if ctx_Text == '"data_setvariableto"' or ctx_Text == '"data_changevariableby"' or ctx_Text == '"data_showvariable"' or ctx_Text == '"data_hidevariable"':
            # 评分标准7-2
            if self.DataRepresentation < 2:
                self.DataRepresentation = 2
                self.log.append('7-2数据表示 2分')

        if ctx_Text == '"data_setvariableto"':
            # 评分标准7-3
            if self.DataRepresentation < 3:
                self.DataRepresentation = 3
                self.log.append('7-3数据表示 3分')

        if ctx_Text in self.data_listoperate:
            # 评分标准7-4
            if self.DataRepresentation < 4:
                self.DataRepresentation = 4
                self.log.append('7-4数据表示 4分')

        if ctx_Text =='"looks_switchbackdropto"' or ctx_Text =='"looks_nextbackdrop"':
            # 评分标准9-1
            if self.content < 1:
                self.content = 1
                self.log.append('9-1内容 1分')

        # 评分标准9-3
        if ctx_Text == '"sensing_touchingobject"' or ctx_Text == '"sensing_keypressed"' or ctx_Text == '"sensing_touchingcolor"' or \
                ctx_Text == '"sensing_coloristouchingcolor"' or ctx_Text == '"sensing_mousedown"':
            if self.content < 3:
                self.content = 3
                self.log.append("9-3内容 3分")

        # 评分标准9-4
        if ctx_Text == '"sound_playuntildone"' or ctx_Text == '"sound_play"' or ctx_Text == '"music_playDrumForBeats"' or \
                ctx_Text == '"music_playNoteForBeats"':
            if self.content < 4:
                self.content = 4
                self.log.append("9-4内容 4分")

        # 评分标准9-5
        if ctx_Text == '"pen_penDown"':
            if self.content < 5:
                self.content = 5
                self.log.append("9-5内容 5分")

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
            self.log.append("1-2抽象和问题分解 2分")
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
        # TODO 模块的各种处理

        # 评分标准1-1
        self.scripts_count =len(self.tempblocks)
        if self.scripts_count > 1 and self.ap_score < 1:
            self.ap_score = 1
            self.log.append("1-1抽象和问题分解 1分")

        # 评分标准2-2
        for dict in self.tempblocks:# 统计一个每一个key的事件数量
            if dict['opcode'] == 'event_whenkeypressed':
                keyinput =str(dict['fields']['KEY_OPTION'][0])
                self.whenkey_countlist[keyinput]+=1
                if self.whenkey_countlist[keyinput] > self.whenkey_count:# 统计当前的最大值
                    self.whenkey_count = self.whenkey_countlist[keyinput]
        if self.whenkey_count>=1 and self.Parallelism_score < 2:
            self.Parallelism_score = 2
            self.log.append("2-2并行 2分")


        # 将tempblocks中的模块区分成一个个单独的模块堆加入到blocks中
        while len(self.tempblocks) != 0:
            if self.tempblocks[0]['topLevel'] == True:  # 是顶层模块，新建一个列表作为整体模块的存储
                topLevel=[]
                topLevel.append(self.tempblocks[0])
                self.tempblocks.pop(0)
                self.blocks.append(topLevel)
            else:  # 不是顶层模块
                parent = self.tempblocks[0]['parent']
                for top in self.blocks:  # 首先在blocks中查找是否存在父模块的列表
                    flag = 1
                    for dict1 in top:
                        if dict1['keyword'] == parent:
                            top.append(self.tempblocks[0])
                            self.tempblocks.remove(self.tempblocks[0])
                            flag = 0
                            break
                    if flag == 0:
                        break
                else:  # 在tempblocks中查找父模块
                    list1 = []
                    list1.append(self.tempblocks[0])
                    topflag =0
                    while topflag ==0:
                        for parentblock in self.tempblocks:
                            if parentblock['keyword'] == parent:
                                list1.append(parentblock)
                                if parentblock['topLevel'] ==False:
                                    parent = parentblock['parent']
                                else:
                                    topflag = 1
                                    break
                        if topflag == 1:
                            break
                    for temp in list1:
                        self.tempblocks.remove(temp)
                    self.blocks.append(list1)
        # 函数递归调用判断
        for list in self.blocks:
            # 评分标准5-1
            for dict in list:
                if dict['topLevel'] == True and dict['next'] !=None and self.FlowControl_score < 1:
                    self.FlowControl_score = 1
                    self.log.append("5-1顺序控制 1分")
            for dict in list:
                # 检测到了有自定义函数的使用
                if dict['opcode'] == 'procedures_prototype':
                    value = dict['mutation']
                    procName = value['proccode']
                    for dict1 in list:
                        if dict1['opcode'] == 'procedures_call' and procName == dict1['mutation']['proccode']:
                            self.Recursively += 1
        # 评分标准1-5
        if self.Recursively >= 1 and self.ap_score < 5:
            self.ap_score = 5
            self.log.append("1-5抽象和问题分解 5分")

        # 先找到if或者if-else找到condition
        for list in self.blocks:
            flag=0
            for dict in list:
                if dict['opcode'] == 'control_if_else' or dict['opcode'] == 'control_if':
                    # 缺少if的条件，是死代码
                    if 'CONDITION' not in dict['inputs']:
                        self.deadcode_count+=1
                    else:
                        str_condition = dict['inputs']['CONDITION'][1]
                        # 将condition加入队列中
                        queue = []
                        queue.append(str_condition)
                        while len(queue) !=0:
                            cond = queue.pop()
                            for blc in list:
                                if blc['keyword'] == cond:
                                    # 评分标准3-3
                                    if blc['opcode'] in self.math_operatelist:
                                        if self.LogicalThinking < 3:
                                            self.LogicalThinking = 3
                                            self.log.append('3-3逻辑思维 3分')
                                        flag = 1
                                        break
                                    # 是单数据的条件判断
                                    elif blc['opcode'] == 'operator_not':
                                        queue.append(blc['inputs']['OPERAND'][1])
                                    # 是双数据的条件判断
                                    elif blc['opcode'] == 'operator_lt' or blc['opcode'] == 'operator_gt' or blc['opcode'] == 'operator_equals'or blc['opcode'] == 'operator_and' or blc['opcode'] == 'operator_or':
                                        queue.append(blc['inputs']['OPERAND1'][1])
                                        queue.append(blc['inputs']['OPERAND2'][1])
                            if flag == 1:
                                break
            if flag == 1:
                break

        # 由于逻辑判断不能放在数学运算的框中，所以只需判断第一层是否是逻辑运算
        for list in self.blocks:
            flag=0
            for dict in list:
                if dict['opcode'] == 'control_if_else' or dict['opcode'] == 'control_if':
                    # 缺少if的条件，是死代码
                    if 'CONDITION' not in dict['inputs']:
                        self.deadcode_count+=1
                    else:
                        str_condition = dict['inputs']['CONDITION'][1]
                        for blc in list:
                            if blc['keyword'] == str_condition:
                                # 评分标准 3-4
                                if blc['opcode'] == 'operator_not' or blc['opcode'] == 'operator_and' or blc['opcode'] == 'operator_or':
                                    if self.LogicalThinking < 4:
                                        self.LogicalThinking = 4
                                        self.log.append('3-4逻辑思维 4分')
                                    flag = 1
                                    break
                if flag == 1:
                    break
            if flag == 1:
                break

        # 判断条件功能的嵌套，只需要判断同一个代码块的list中if或if-else语句的数量
        for list in self.blocks:
            if_count = 0
            queue = []
            for dict in list:
                #找到if判断并记录内部的模块
                if dict['opcode'] == 'control_if_else':
                    queue.append(dict['inputs']['SUBSTACK'][1])
                    queue.append(dict['inputs']['SUBSTACK2'][1])
                if dict['opcode'] == 'control_if':
                    queue.append(dict['inputs']['SUBSTACK'][1])
                while len(queue) != 0:
                    substack = queue.pop()
                    for sub in list:
                        if sub['keyword'] == substack:
                            if sub['opcode'] == 'control_if_else' or sub['opcode'] == 'control_if':
                                if_count = 1
                                break
                            else:
                                for sub2 in list:
                                    if sub2['parent'] == substack:
                                        queue.append(sub2['keyword'])
                    if if_count == 1:
                        break
                if if_count == 1:
                    break
            # 评分标准3-5
            if if_count == 1 and self.LogicalThinking < 5:
                self.LogicalThinking = 5
                self.log.append('3-5逻辑思维 5分')
                break



        #判断循环条件涉及到逻辑操作
        for list in self.blocks:
            flag=0
            for dict in list:
                if dict['opcode'] == 'control_repeat_until' :
                    # 缺少if的条件，是死代码
                    if 'CONDITION' not in dict['inputs']:
                        self.deadcode_count += 1
                    else:
                        str_condition = dict['inputs']['CONDITION'][1]
                        for blc in list:
                            if blc['keyword'] == str_condition:
                                # 评分标准 5-4
                                if blc['opcode'] == 'operator_not' or blc['opcode'] == 'operator_and' or blc['opcode'] == 'operator_or':
                                    if self.FlowControl_score < 4:
                                        self.FlowControl_score = 4
                                        self.log.append('5-4逻辑思维 4分')
                                    flag = 1
                                    break
                if flag == 1:
                    break
            if flag == 1:
                break

        #循环中嵌套判断语句的处理
        for list in self.blocks:
            flag = 0
            for dict in list:
                if dict['opcode'] == 'control_repeat_until' or dict['opcode'] == 'control_forever' or dict['opcode'] == 'control_repeat':
                    parentCode = dict['keyword']
                    queue = []
                    queue.append(parentCode)

                    while len(queue) > 0:
                        parentCode = queue.pop()
                        for blck in list:
                            if blck['parent'] == parentCode:
                                if blck['opcode'] == 'control_if_else' or blck['opcode'] == 'control_if':
                                    # 评分标准5-5
                                    if self.FlowControl_score < 5:
                                        self.FlowControl_score = 5
                                        self.log.append("5-5顺序控制 5分")
                                    flag = 1
                                    break
                                else:
                                    queue.append(blck['keyword'])
                        if flag == 1:
                            break
                if flag == 1:
                    break
            if flag == 1:
                break


        pass


    # Enter a parse tree produced by AntlrParser#block_content.
    def enterBlock_content(self, ctx:AntlrParser.Block_contentContext):
        # 将脚本添加入blocks变量中做记录
        list1 = ctx.getText().split('"', 2)
        name = list1[1]
        para = json.loads(list1[2].strip(':'))
        para['keyword'] = name
        self.tempblocks.append(para)

        # 添加需要接受的广播列表
        if para['opcode'] == 'event_whenbroadcastreceived':
            if self.receivelist.count(para['fields']['BROADCAST_OPTION'][1]) == 0:
                self.receivelist.append(para['fields']['BROADCAST_OPTION'][1])
        # 添加发送的广播列表
        if para['opcode'] == 'event_broadcast' or para['opcode'] == 'event_broadcastandwait':
            if self.broadcastlist.count(para['inputs']['BROADCAST_INPUT'][1][2]) == 0:
                self.broadcastlist.append(para['inputs']['BROADCAST_INPUT'][1][2])

        # 统计每个收到消息启动块需要的消息
        if para['opcode'] == 'event_whenbroadcastreceived':
            want = para['fields']['BROADCAST_OPTION'][1]
            for wantlist in self.want_to_recive:
                if want in wantlist:
                    wantlist[1] += 1
                    break
            else:
                self.want_to_recive.append([want, 1])
        # 评分标准1-3
        if para['opcode'] =='procedures_definition':
            self.proj_count+=1
            if self.proj_count > 0 and self.ap_score < 3:
                self.ap_score = 3
                self.log.append("1-3抽象和问题分解 3分")
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
        # 评分标准8-3
        self.comments_count += 1
        if self.CodeOrganization < 3:
            self.CodeOrganization = 3
            self.log.append("8-3代码组织 3分")
        pass

    # Exit a parse tree produced by AntlrParser#comment_content.
    def exitComment_content(self, ctx:AntlrParser.Comment_contentContext):
        pass


