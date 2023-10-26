// Developed by: Guilherme Sofiati Fantin

SCRIPT_START
{
    LVAR_INT scplayer secs
    LVAR_FLOAT framedelta
    LVAR_INT loop lockX lockY lockF time

    IF NOT READ_FLOAT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "framedelta" framedelta
        framedelta = 4.0
    ENDIF

    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "loop" loop
        loop = 0
    ENDIF

    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "lockX" lockX
        lockX = 0
    ENDIF

    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "lockY" lockY
        lockY = 0
    ENDIF

    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "lockF" lockF
        lockF = 0
    ENDIF

    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "time" time
        time = 0
    ENDIF
    
    IF NOT READ_INT_FROM_INI_FILE "CLEO\animes.ini" "Anim Props" "secs" secs
        secs = 1000
    ENDIF

    GET_PLAYER_CHAR 0 scplayer

    WHILE TRUE
        WAIT secs

        IF IS_KEY_PRESSED VK_KEY_K
            WHILE IS_KEY_PRESSED VK_KEY_K
                WAIT 0
                CLEAR_CHAR_TASKS_IMMEDIATELY scplayer
            ENDWHILE
        ELSE
        IF TEST_CHEAT "Z995"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("abseil" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z996"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("arrestgun" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z997"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("atm" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z998"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_elbowl" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z999"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_elbowr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1000"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_fallr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1001"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_fall_off" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1002"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_pickupl" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1003"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_pickupr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1004"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_pullupl" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1005"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bike_pullupr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1006"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bomber" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1007"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_alignhi_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1008"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_alignhi_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1009"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_align_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1010"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_align_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1011"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_closedoorl_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1012"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_closedoorl_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1013"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_closedoor_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1014"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_closedoor_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1015"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_close_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1016"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_close_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1017"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_crawloutrhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1018"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_dead_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1019"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_dead_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1020"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_doorlocked_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1021"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_doorlocked_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1022"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_fallout_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1023"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_fallout_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1024"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getinl_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1025"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getinl_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1026"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getin_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1027"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getin_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1028"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getoutl_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1029"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getoutl_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1030"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getout_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1031"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_getout_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1032"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_hookertalk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1033"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_jackedlhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1034"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_jackedrhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1035"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_jumpin_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1036"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_lb" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1037"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_lb_pro" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1038"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_lb_weak" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1039"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_ljackedlhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1040"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_ljackedrhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1041"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_lshuffle_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1042"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_lsit" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1043"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_open_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1044"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_open_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1045"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_pulloutl_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1046"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_pulloutl_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1047"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_pullout_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1048"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_pullout_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1049"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_qjacked" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1050"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_rolldoor" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1051"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_rolldoorlo" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1052"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_rollout_lhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1053"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_rollout_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1054"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_shuffle_rhs" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1055"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sit" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1056"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sitp" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1057"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sitplo" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1058"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sit_pro" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1059"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sit_weak" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1060"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_tune_radio" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1061"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_idle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1062"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_jump" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1063"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_jump2fall" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1064"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_jump_b" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1065"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_pull" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1066"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_stand" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1067"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("climb_stand_finish" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1068"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cower" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1069"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crouch_roll_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1070"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crouch_roll_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1071"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_arml_frmbk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1072"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_arml_frmft" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1073"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_arml_frmlt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1074"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_armr_frmbk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1075"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_armr_frmft" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1076"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_armr_frmrt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1077"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legl_frmbk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1078"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legl_frmft" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1079"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legl_frmlt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1080"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legr_frmbk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1081"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legr_frmft" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1082"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_legr_frmrt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1083"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_stomach_frmbk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1084"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_stomach_frmft" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1085"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_stomach_frmlt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1086"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_stomach_frmrt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1087"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("door_lhinge_o" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1088"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("door_rhinge_o" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1089"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drivebyl_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1090"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drivebyl_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1091"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("driveby_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1092"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("driveby_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1093"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_boat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1094"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_boat_back" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1095"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_boat_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1096"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_boat_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1097"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1098"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_lo_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1099"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_lo_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1100"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l_pro" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1101"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l_pro_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1102"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1103"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l_weak" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1104"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_l_weak_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1105"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1106"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r_pro" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1107"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r_pro_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1108"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1109"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r_weak" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1110"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_r_weak_slow" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1111"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_truck" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1112"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_truck_back" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1113"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_truck_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1114"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drive_truck_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1115"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drown" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1116"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("duck_cower" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1117"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("endchat_01" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1118"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("endchat_02" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1119"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("endchat_03" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1120"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ev_dive" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1121"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ev_step" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1122"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("facanger" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1123"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("facgum" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1124"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("facsurp" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1125"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("facsurpm" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1126"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("factalk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1127"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("facurios" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1128"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_back" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1129"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_collapse" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1130"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_fall" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1131"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_front" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1132"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_glide" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1133"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_land" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1134"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1135"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fight2idle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1136"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_1" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1137"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_2" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1138"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_3" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1139"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_block" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1140"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_g" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1141"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fighta_m" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1142"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightidle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1143"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightshb" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1144"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightshf" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1145"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightsh_bwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1146"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightsh_fwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1147"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightsh_left" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1148"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightsh_right" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1149"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flee_lkaround_01" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1150"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("floor_hit" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1151"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("floor_hit_f" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1152"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fucku" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1153"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_gunstand" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1154"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gas_cwr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1155"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("getup" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1156"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("getup_front" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1157"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gum_eat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1158"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("guncrouchbwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1159"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("guncrouchfwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1160"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gunmove_bwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1161"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gunmove_fwd" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1162"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gunmove_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1163"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gunmove_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1164"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gun_2_idle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1165"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gun_butt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1166"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gun_butt_crouch" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1167"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gun_stand" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1168"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("handscower" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1169"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("handsup" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1170"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hita_1" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1171"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hita_2" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1172"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hita_3" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1173"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_back" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1174"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_behind" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1175"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_front" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1176"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_gun_butt" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1177"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1178"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1179"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_walk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1180"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_wall" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1181"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idlestance_fat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1182"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idlestance_old" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1183"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_armed" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1184"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_chat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1185"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_csaw" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1186"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_gang1" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1187"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_hbhb" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1188"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_rocket" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1189"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_stance" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1190"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_taxi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1191"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_tired" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1192"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jetpack_idle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1193"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jog_femalea" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1194"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jog_malea" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1195"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jump_glide" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1196"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jump_land" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1197"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jump_launch" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1198"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jump_launch_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1199"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_drive" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1200"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1201"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_lb" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1202"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1203"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kd_left" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1204"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kd_right" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1205"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_shot_face" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1206"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_shot_front" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1207"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_shot_stom" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1208"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_skid_back" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1209"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_skid_front" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1210"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_spin_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1211"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ko_spin_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1212"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_smoke_in_car" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1213"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("phone_in" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1214"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("phone_out" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1215"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("phone_talk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1216"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("player_sneak" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1217"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("player_sneak_walkstart" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1218"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roadcross" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1219"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roadcross_female" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1220"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roadcross_gang" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1221"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roadcross_old" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1222"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_1armed" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1223"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_armed" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1224"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_civi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1225"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_csaw" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1226"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_fat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1227"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_fatold" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1228"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_gang1" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1229"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_left" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1230"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_old" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1231"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_player" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1232"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_right" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1233"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_rocket" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1234"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_stop" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1235"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_stopr" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1236"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_wuzi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1237"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_down" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1238"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_idle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1239"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_up" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1240"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shot_leftp" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1241"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shot_partial" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1242"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shot_partial_b" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1243"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shot_rightp" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1244"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shove_partial" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1245"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smoke_in_car" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1246"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sprint_civi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1247"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sprint_panic" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1248"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sprint_wuzi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1249"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swat_run" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1250"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_tread" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1251"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tap_hand" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1252"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tap_handp" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1253"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("turn_180" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1254"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("turn_l" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1255"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("turn_r" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1256"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_armed" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1257"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_civi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1258"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_csaw" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1259"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_doorpartial" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1260"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_drunk" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1261"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_fat" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1262"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_fatold" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1263"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_gang1" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1264"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_gang2" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1265"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_old" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1266"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_player" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1267"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_rocket" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1268"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_shuffle" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1269"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_start" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1270"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_start_armed" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1271"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_start_csaw" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1272"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_start_rocket" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1273"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_wuzi" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1274"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_crouch" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1275"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_idlestance" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1276"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_run" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1277"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_runbusy" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1278"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_runfatold" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1279"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_runpanic" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1280"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_runsexy" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1281"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walkbusy" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1282"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walkfatold" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1283"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walknorm" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1284"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walkold" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1285"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walkpro" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1286"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walksexy" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1287"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("woman_walkshop" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1288"
            GOSUB ped_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("xpressscratch" "PED") (framedelta loop lockX lockY lockF) time
            GOSUB ped_anims_unload
        ELSE
        IF TEST_CHEAT "Z1289"
            GOSUB playerdvbys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_drivebybwd" "PLAYER_DVBYS") (framedelta loop lockX lockY lockF) time
            GOSUB playerdvbys_anims_unload
        ELSE
        IF TEST_CHEAT "Z1290"
            GOSUB playerdvbys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_drivebyfwd" "PLAYER_DVBYS") (framedelta loop lockX lockY lockF) time
            GOSUB playerdvbys_anims_unload
        ELSE
        IF TEST_CHEAT "Z1291"
            GOSUB playerdvbys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_drivebylhs" "PLAYER_DVBYS") (framedelta loop lockX lockY lockF) time
            GOSUB playerdvbys_anims_unload
        ELSE
        IF TEST_CHEAT "Z1292"
            GOSUB playerdvbys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_drivebyrhs" "PLAYER_DVBYS") (framedelta loop lockX lockY lockF) time
            GOSUB playerdvbys_anims_unload
        ELSE
        IF TEST_CHEAT "Z1293"
            GOSUB playidles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shift" "PLAYIDLES") (framedelta loop lockX lockY lockF) time
            GOSUB playidles_anims_unload
        ELSE
        IF TEST_CHEAT "Z1294"
            GOSUB playidles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shldr" "PLAYIDLES") (framedelta loop lockX lockY lockF) time
            GOSUB playidles_anims_unload
        ELSE
        IF TEST_CHEAT "Z1295"
            GOSUB playidles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("stretch" "PLAYIDLES") (framedelta loop lockX lockY lockF) time
            GOSUB playidles_anims_unload
        ELSE
        IF TEST_CHEAT "Z1296"
            GOSUB playidles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strleg" "PLAYIDLES") (framedelta loop lockX lockY lockF) time
            GOSUB playidles_anims_unload
        ELSE
        IF TEST_CHEAT "Z1297"
            GOSUB playidles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("time" "PLAYIDLES") (framedelta loop lockX lockY lockF) time
            GOSUB playidles_anims_unload
        ELSE
        IF TEST_CHEAT "Z1298"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coptraf_away" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1299"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coptraf_come" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1300"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coptraf_left" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1301"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coptraf_stop" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1302"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_getoutcar_lhs" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1303"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_move_fwd" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1304"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crm_drgbst_01" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1305"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("door_kick" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1306"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plc_drgbst_01" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1307"
            GOSUB police_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plc_drgbst_02" "POLICE") (framedelta loop lockX lockY lockF) time
            GOSUB police_anims_unload
        ELSE
        IF TEST_CHEAT "Z1308"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_chalkcue" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1309"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_idle_stance" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1310"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_long_shot" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1311"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_long_shot_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1312"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_long_start" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1313"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_long_start_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1314"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_med_shot" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1315"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_med_shot_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1316"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_med_start" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1317"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_med_start_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1318"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_place_white" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1319"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_short_shot" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1320"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_short_shot_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1321"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_short_start" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1322"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_short_start_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1323"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_walk" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1324"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_walk_start" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1325"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_xlong_shot" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1326"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_xlong_shot_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1327"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_xlong_start" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1328"
            GOSUB pool_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pool_xlong_start_o" "POOL") (framedelta loop lockX lockY lockF) time
            GOSUB pool_anims_unload
        ELSE
        IF TEST_CHEAT "Z1329"
            GOSUB poor_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("winwash_start" "POOR") (framedelta loop lockX lockY lockF) time
            GOSUB poor_anims_unload
        ELSE
        IF TEST_CHEAT "Z1330"
            GOSUB poor_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("winwash_wash2beg" "POOR") (framedelta loop lockX lockY lockF) time
            GOSUB poor_anims_unload
        ELSE
        IF TEST_CHEAT "Z1331"
            GOSUB python_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("python_crouchfire" "PYTHON") (framedelta loop lockX lockY lockF) time
            GOSUB python_anims_unload
        ELSE
        IF TEST_CHEAT "Z1332"
            GOSUB python_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("python_crouchreload" "PYTHON") (framedelta loop lockX lockY lockF) time
            GOSUB python_anims_unload
        ELSE
        IF TEST_CHEAT "Z1333"
            GOSUB python_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("python_fire" "PYTHON") (framedelta loop lockX lockY lockF) time
            GOSUB python_anims_unload
        ELSE
        IF TEST_CHEAT "Z1334"
            GOSUB python_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("python_fire_poor" "PYTHON") (framedelta loop lockX lockY lockF) time
            GOSUB python_anims_unload
        ELSE
        IF TEST_CHEAT "Z1335"
            GOSUB python_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("python_reload" "PYTHON") (framedelta loop lockX lockY lockF) time
            GOSUB python_anims_unload
        ELSE
        IF TEST_CHEAT "Z1336"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_back" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1337"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_driveby_ft" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1338"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_driveby_lhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1339"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_driveby_rhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1340"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_fwd" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1341"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_getoff_b" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1342"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_getoff_lhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1343"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_getoff_rhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1344"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_geton_lhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1345"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_geton_rhs" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1346"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_hit" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1347"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_kick" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1348"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_left" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1349"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_passenger" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1350"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_reverse" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1351"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_ride" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1352"
            GOSUB quad_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("quad_right" "QUAD") (framedelta loop lockX lockY lockF) time
            GOSUB quad_anims_unload
        ELSE
        IF TEST_CHEAT "Z1353"
            GOSUB quaddbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_bwd" "QUAD_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB quaddbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1354"
            GOSUB quaddbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_fwd" "QUAD_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB quaddbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1355"
            GOSUB quaddbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_lhs" "QUAD_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB quaddbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1356"
            GOSUB quaddbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_rhs" "QUAD_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB quaddbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1357"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("laugh_01" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1358"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_a_in" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1359"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_a_loop" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1360"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_a_out" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1361"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_b_in" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1362"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_b_loop" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1363"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_b_out" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1364"
            GOSUB rapping_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_c_loop" "RAPPING") (framedelta loop lockX lockY lockF) time
            GOSUB rapping_anims_unload
        ELSE
        IF TEST_CHEAT "Z1365"
            GOSUB rifle_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rifle_crouchfire" "RIFLE") (framedelta loop lockX lockY lockF) time
            GOSUB rifle_anims_unload
        ELSE
        IF TEST_CHEAT "Z1366"
            GOSUB rifle_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rifle_crouchload" "RIFLE") (framedelta loop lockX lockY lockF) time
            GOSUB rifle_anims_unload
        ELSE
        IF TEST_CHEAT "Z1367"
            GOSUB rifle_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rifle_fire" "RIFLE") (framedelta loop lockX lockY lockF) time
            GOSUB rifle_anims_unload
        ELSE
        IF TEST_CHEAT "Z1368"
            GOSUB rifle_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rifle_fire_poor" "RIFLE") (framedelta loop lockX lockY lockF) time
            GOSUB rifle_anims_unload
        ELSE
        IF TEST_CHEAT "Z1369"
            GOSUB rifle_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rifle_load" "RIFLE") (framedelta loop lockX lockY lockF) time
            GOSUB rifle_anims_unload
        ELSE
        IF TEST_CHEAT "Z1370"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_angry" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1371"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_angry_b" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1372"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_challenge" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1373"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_chant" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1374"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_fuku" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1375"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_punches" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1376"
            GOSUB riot_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("riot_shout" "RIOT") (framedelta loop lockX lockY lockF) time
            GOSUB riot_anims_unload
        ELSE
        IF TEST_CHEAT "Z1377"
            GOSUB robbank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cat_safe_end" "ROB_BANK") (framedelta loop lockX lockY lockF) time
            GOSUB robbank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1378"
            GOSUB robbank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cat_safe_open" "ROB_BANK") (framedelta loop lockX lockY lockF) time
            GOSUB robbank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1379"
            GOSUB robbank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cat_safe_open_o" "ROB_BANK") (framedelta loop lockX lockY lockF) time
            GOSUB robbank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1380"
            GOSUB robbank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cat_safe_rob" "ROB_BANK") (framedelta loop lockX lockY lockF) time
            GOSUB robbank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1381"
            GOSUB robbank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_handsup_scr" "ROB_BANK") (framedelta loop lockX lockY lockF) time
            GOSUB robbank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1382"
            GOSUB rocket_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_rocket" "ROCKET") (framedelta loop lockX lockY lockF) time
            GOSUB rocket_anims_unload
        ELSE
        IF TEST_CHEAT "Z1383"
            GOSUB rocket_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rocketfire" "ROCKET") (framedelta loop lockX lockY lockF) time
            GOSUB rocket_anims_unload
        ELSE
        IF TEST_CHEAT "Z1384"
            GOSUB rocket_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_rocket" "ROCKET") (framedelta loop lockX lockY lockF) time
            GOSUB rocket_anims_unload
        ELSE
        IF TEST_CHEAT "Z1385"
            GOSUB rocket_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_rocket" "ROCKET") (framedelta loop lockX lockY lockF) time
            GOSUB rocket_anims_unload
        ELSE
        IF TEST_CHEAT "Z1386"
            GOSUB rocket_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walk_start_rocket" "ROCKET") (framedelta loop lockX lockY lockF) time
            GOSUB rocket_anims_unload
        ELSE
        IF TEST_CHEAT "Z1387"
            GOSUB rustler_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_align_lhs" "RUSTLER") (framedelta loop lockX lockY lockF) time
            GOSUB rustler_anims_unload
        ELSE
        IF TEST_CHEAT "Z1388"
            GOSUB rustler_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_close" "RUSTLER") (framedelta loop lockX lockY lockF) time
            GOSUB rustler_anims_unload
        ELSE
        IF TEST_CHEAT "Z1389"
            GOSUB rustler_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_getin" "RUSTLER") (framedelta loop lockX lockY lockF) time
            GOSUB rustler_anims_unload
        ELSE
        IF TEST_CHEAT "Z1390"
            GOSUB rustler_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_getout" "RUSTLER") (framedelta loop lockX lockY lockF) time
            GOSUB rustler_anims_unload
        ELSE
        IF TEST_CHEAT "Z1391"
            GOSUB rustler_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_open" "RUSTLER") (framedelta loop lockX lockY lockF) time
            GOSUB rustler_anims_unload
        ELSE
        IF TEST_CHEAT "Z1392"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ryd_beckon_01" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1393"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ryd_beckon_02" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1394"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ryd_beckon_03" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1395"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ryd_die_pt1" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1396"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ryd_die_pt2" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1397"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_crate_l" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1398"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_crate_r" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1399"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_fall_l" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1400"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_fall_r" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1401"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_lean_l" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1402"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_lean_r" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1403"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_pickup_e" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1404"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_pickup_s" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1405"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_stand" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1406"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_stand_crate" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1407"
            GOSUB ryder_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_throw" "RYDER") (framedelta loop lockX lockY lockF) time
            GOSUB ryder_anims_unload
        ELSE
        IF TEST_CHEAT "Z1408"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scdldlp" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1409"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scdlulp" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1410"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scdrdlp" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1411"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scdrulp" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1412"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sclng_l" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1413"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sclng_r" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1414"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scmid_l" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1415"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scmid_r" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1416"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scshrtl" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1417"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scshrtr" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1418"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sc_ltor" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1419"
            GOSUB scratching_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sc_rtol" "SCRATCHING") (framedelta loop lockX lockY lockF) time
            GOSUB scratching_anims_unload
        ELSE
        IF TEST_CHEAT "Z1420"
            GOSUB shamal_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shamal_align" "SHAMAL") (framedelta loop lockX lockY lockF) time
            GOSUB shamal_anims_unload
        ELSE
        IF TEST_CHEAT "Z1421"
            GOSUB shamal_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shamal_getin_lhs" "SHAMAL") (framedelta loop lockX lockY lockF) time
            GOSUB shamal_anims_unload
        ELSE
        IF TEST_CHEAT "Z1422"
            GOSUB shamal_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shamal_getout_lhs" "SHAMAL") (framedelta loop lockX lockY lockF) time
            GOSUB shamal_anims_unload
        ELSE
        IF TEST_CHEAT "Z1423"
            GOSUB shamal_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shamal_open" "SHAMAL") (framedelta loop lockX lockY lockF) time
            GOSUB shamal_anims_unload
        ELSE
        IF TEST_CHEAT "Z1424"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rob_2idle" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1425"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rob_loop" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1426"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rob_loop_threat" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1427"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rob_shifty" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1428"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rob_stickup_in" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1429"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_duck" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1430"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_duck_aim" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1431"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_duck_fire" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1432"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_gun_aim" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1433"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_gun_duck" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1434"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_gun_fire" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1435"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_gun_grab" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1436"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_gun_threat" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1437"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_handsup_scr" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1438"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_jump_glide" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1439"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_jump_land" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1440"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_jump_launch" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1441"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_rob_givecash" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1442"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_rob_handsup" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1443"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_rob_react" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1444"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_serve_end" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1445"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_serve_idle" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1446"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_serve_loop" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1447"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_serve_start" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1448"
            GOSUB shop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smoke_ryd" "SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB shop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1449"
            GOSUB shotgun_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shotgun_crouchfire" "SHOTGUN") (framedelta loop lockX lockY lockF) time
            GOSUB shotgun_anims_unload
        ELSE
        IF TEST_CHEAT "Z1450"
            GOSUB shotgun_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shotgun_fire" "SHOTGUN") (framedelta loop lockX lockY lockF) time
            GOSUB shotgun_anims_unload
        ELSE
        IF TEST_CHEAT "Z1451"
            GOSUB shotgun_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shotgun_fire_poor" "SHOTGUN") (framedelta loop lockX lockY lockF) time
            GOSUB shotgun_anims_unload
        ELSE
        IF TEST_CHEAT "Z1452"
            GOSUB silenced_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crouchreload" "SILENCED") (framedelta loop lockX lockY lockF) time
            GOSUB silenced_anims_unload
        ELSE
        IF TEST_CHEAT "Z1453"
            GOSUB silenced_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("silencecrouchfire" "SILENCED") (framedelta loop lockX lockY lockF) time
            GOSUB silenced_anims_unload
        ELSE
        IF TEST_CHEAT "Z1454"
            GOSUB silenced_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("silence_fire" "SILENCED") (framedelta loop lockX lockY lockF) time
            GOSUB silenced_anims_unload
        ELSE
        IF TEST_CHEAT "Z1455"
            GOSUB silenced_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("silence_reload" "SILENCED") (framedelta loop lockX lockY lockF) time
            GOSUB silenced_anims_unload
        ELSE
        IF TEST_CHEAT "Z1456"
            GOSUB skate_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("skate_idle" "SKATE") (framedelta loop lockX lockY lockF) time
            GOSUB skate_anims_unload
        ELSE
        IF TEST_CHEAT "Z1457"
            GOSUB skate_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("skate_run" "SKATE") (framedelta loop lockX lockY lockF) time
            GOSUB skate_anims_unload
        ELSE
        IF TEST_CHEAT "Z1458"
            GOSUB skate_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("skate_sprint" "SKATE") (framedelta loop lockX lockY lockF) time
            GOSUB skate_anims_unload
        ELSE
        IF TEST_CHEAT "Z1459"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("f_smklean_loop" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1460"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smklean_loop" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1461"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smkstnd_loop" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1462"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smk_drag" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1463"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smk_in" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1464"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smk_loop" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1465"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smk_out" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1466"
            GOSUB smoking_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smk_tap" "SMOKING") (framedelta loop lockX lockY lockF) time
            GOSUB smoking_anims_unload
        ELSE
        IF TEST_CHEAT "Z1467"
            GOSUB sniper_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_sniper" "SNIPER") (framedelta loop lockX lockY lockF) time
            GOSUB sniper_anims_unload
        ELSE
        IF TEST_CHEAT "Z1468"
            GOSUB spraycan_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spraycan_fire" "SPRAYCAN") (framedelta loop lockX lockY lockF) time
            GOSUB spraycan_anims_unload
        ELSE
        IF TEST_CHEAT "Z1469"
            GOSUB spraycan_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spraycan_full" "SPRAYCAN") (framedelta loop lockX lockY lockF) time
            GOSUB spraycan_anims_unload
        ELSE
        IF TEST_CHEAT "Z1470"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ply_cash" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1471"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pun_cash" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1472"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pun_holler" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1473"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pun_loop" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1474"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_a" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1475"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_b" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1476"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_c" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1477"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_d" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1478"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_e" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1479"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_f" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1480"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("strip_g" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1481"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_a2b" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1482"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_b2a" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1483"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_b2c" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1484"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_c1" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1485"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_c2" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1486"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_c2b" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1487"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_loop_a" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1488"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_loop_b" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1489"
            GOSUB strip_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("str_loop_c" "STRIP") (framedelta loop lockX lockY lockF) time
            GOSUB strip_anims_unload
        ELSE
        IF TEST_CHEAT "Z1490"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("batherdown" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1491"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("batherup" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1492"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lay_bac_in" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1493"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lay_bac_out" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1494"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_idlea" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1495"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_idleb" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1496"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_idlec" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1497"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_in" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1498"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_out" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1499"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_idlea" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1500"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_idleb" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1501"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_idlec" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1502"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_in" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1503"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_out" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1504"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sbathe_f_lieb2sit" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1505"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sbathe_f_out" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1506"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sitnwait_in_w" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1507"
            GOSUB sunbathe_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sitnwait_out_w" "SUNBATHE") (framedelta loop lockX lockY lockF) time
            GOSUB sunbathe_anims_unload
        ELSE
        IF TEST_CHEAT "Z1508"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gnstwall_injurd" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1509"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jmp_wall1m_180" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1510"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rail_fall" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1511"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rail_fall_crawl" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1512"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_breach_01" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1513"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_breach_02" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1514"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_breach_03" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1515"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_go" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1516"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_lkt" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1517"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_sty" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1518"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_vent_01" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1519"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_vent_02" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1520"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_vnt_sht_die" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1521"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_vnt_sht_in" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1522"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_vnt_sht_loop" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1523"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_l" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1524"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_l_back" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1525"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_r" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1526"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_r_back" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1527"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_in_l" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1528"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_in_r" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1529"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_out_l" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1530"
            GOSUB swat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_out_r" "SWAT") (framedelta loop lockX lockY lockF) time
            GOSUB swat_anims_unload
        ELSE
        IF TEST_CHEAT "Z1531"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ho_ass_slapped" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1532"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lafin_player" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1533"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lafin_sweet" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1534"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_hndshldr_01" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1535"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sweet_ass_slap" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1536"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sweet_hndshldr_01" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1537"
            GOSUB sweet_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sweet_injuredloop" "SWEET") (framedelta loop lockX lockY lockF) time
            GOSUB sweet_anims_unload
        ELSE
        IF TEST_CHEAT "Z1538"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_breast" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1539"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_crawl" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1540"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_dive_under" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1541"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_glide" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1542"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_jumpout" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1543"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_tread" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1544"
            GOSUB swim_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swim_under" "SWIM") (framedelta loop lockX lockY lockF) time
            GOSUB swim_anims_unload
        ELSE
        IF TEST_CHEAT "Z1545"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_1" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1546"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_2" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1547"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_3" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1548"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_4" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1549"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_block" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1550"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_hit_1" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1551"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_hit_2" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1552"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_hit_3" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1553"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_idle" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1554"
            GOSUB sword_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sword_part" "SWORD") (framedelta loop lockX lockY lockF) time
            GOSUB sword_anims_unload
        ELSE
        IF TEST_CHEAT "Z1555"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_align_lhs" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1556"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_close_lhs" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1557"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_doorlocked" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1558"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_getin_lhs" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1559"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_getout_lhs" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1560"
            GOSUB tank_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tank_open_lhs" "TANK") (framedelta loop lockX lockY lockF) time
            GOSUB tank_anims_unload
        ELSE
        IF TEST_CHEAT "Z1561"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1562"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1563"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1564"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1565"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1566"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1567"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_pose_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1568"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_pose_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1569"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_arml_pose_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1570"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1571"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1572"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1573"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1574"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1575"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1576"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_pose_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1577"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_pose_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1578"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_armr_pose_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1579"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1580"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1581"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1582"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1583"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1584"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1585"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_pose_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1586"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_pose_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1587"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_pose_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1588"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_sit_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1589"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_sit_loop_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1590"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_back_sit_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1591"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1592"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1593"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1594"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1595"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_pose_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1596"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_bel_pose_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1597"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1598"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1599"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1600"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1601"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1602"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1603"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_pose_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1604"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_pose_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1605"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_che_pose_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1606"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_drop_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1607"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_idle_loop_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1608"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_idle_loop_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1609"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_in_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1610"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_in_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1611"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_in_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1612"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_loop_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1613"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_loop_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1614"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_loop_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1615"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_out_o" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1616"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_out_p" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1617"
            GOSUB tattoos_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tat_sit_out_t" "TATTOOS") (framedelta loop lockX lockY lockF) time
            GOSUB tattoos_anims_unload
        ELSE
        IF TEST_CHEAT "Z1618"
            GOSUB tec_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tec_crouchfire" "TEC") (framedelta loop lockX lockY lockF) time
            GOSUB tec_anims_unload
        ELSE
        IF TEST_CHEAT "Z1619"
            GOSUB tec_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tec_crouchreload" "TEC") (framedelta loop lockX lockY lockF) time
            GOSUB tec_anims_unload
        ELSE
        IF TEST_CHEAT "Z1620"
            GOSUB tec_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tec_fire" "TEC") (framedelta loop lockX lockY lockF) time
            GOSUB tec_anims_unload
        ELSE
        IF TEST_CHEAT "Z1621"
            GOSUB tec_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tec_reload" "TEC") (framedelta loop lockX lockY lockF) time
            GOSUB tec_anims_unload
        ELSE
        IF TEST_CHEAT "Z1622"
            GOSUB train_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tran_gtup" "TRAIN") (framedelta loop lockX lockY lockF) time
            GOSUB train_anims_unload
        ELSE
        IF TEST_CHEAT "Z1623"
            GOSUB train_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tran_hng" "TRAIN") (framedelta loop lockX lockY lockF) time
            GOSUB train_anims_unload
        ELSE
        IF TEST_CHEAT "Z1624"
            GOSUB train_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tran_ouch" "TRAIN") (framedelta loop lockX lockY lockF) time
            GOSUB train_anims_unload
        ELSE
        IF TEST_CHEAT "Z1625"
            GOSUB train_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tran_stmb" "TRAIN") (framedelta loop lockX lockY lockF) time
            GOSUB train_anims_unload
        ELSE
        IF TEST_CHEAT "Z1626"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_align_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1627"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_align_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1628"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_closedoor_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1629"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_closedoor_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1630"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_close_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1631"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_close_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1632"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_getin_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1633"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_getin_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1634"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_getout_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1635"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_getout_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1636"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_jackedlhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1637"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_jackedrhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1638"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_open_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1639"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_open_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1640"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_pullout_lhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1641"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_pullout_rhs" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1642"
            GOSUB truck_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_shuffle" "TRUCK") (framedelta loop lockX lockY lockF) time
            GOSUB truck_anims_unload
        ELSE
        IF TEST_CHEAT "Z1643"
            GOSUB uzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("uzi_crouchfire" "UZI") (framedelta loop lockX lockY lockF) time
            GOSUB uzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1644"
            GOSUB uzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("uzi_crouchreload" "UZI") (framedelta loop lockX lockY lockF) time
            GOSUB uzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1645"
            GOSUB uzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("uzi_fire" "UZI") (framedelta loop lockX lockY lockF) time
            GOSUB uzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1646"
            GOSUB uzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("uzi_fire_poor" "UZI") (framedelta loop lockX lockY lockF) time
            GOSUB uzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1647"
            GOSUB uzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("uzi_reload" "UZI") (framedelta loop lockX lockY lockF) time
            GOSUB uzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1648"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_close_back_lhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1649"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_close_back_rhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1650"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_getin_back_lhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1651"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_getin_back_rhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1652"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_getout_back_lhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1653"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_getout_back_rhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1654"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_open_back_lhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1655"
            GOSUB van_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("van_open_back_rhs" "VAN") (framedelta loop lockX lockY lockF) time
            GOSUB van_anims_unload
        ELSE
        IF TEST_CHEAT "Z1656"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_drink2_p" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1657"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_drink_p" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1658"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_eat1_p" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1659"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_eat_p" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1660"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_use" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1661"
            GOSUB vending_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vend_use_pt2" "VENDING") (framedelta loop lockX lockY lockF) time
            GOSUB vending_anims_unload
        ELSE
        IF TEST_CHEAT "Z1662"
            GOSUB vortex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_jumpin_lhs" "VORTEX") (framedelta loop lockX lockY lockF) time
            GOSUB vortex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1663"
            GOSUB vortex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_jumpin_rhs" "VORTEX") (framedelta loop lockX lockY lockF) time
            GOSUB vortex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1664"
            GOSUB vortex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vortex_getout_lhs" "VORTEX") (framedelta loop lockX lockY lockF) time
            GOSUB vortex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1665"
            GOSUB vortex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("vortex_getout_rhs" "VORTEX") (framedelta loop lockX lockY lockF) time
            GOSUB vortex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1666"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_back" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1667"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_drivebyft" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1668"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_drivebylhs" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1669"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_drivebyrhs" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1670"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_fwd" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1671"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_getoffback" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1672"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_getofflhs" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1673"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_getoffrhs" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1674"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_hit" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1675"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_jumponl" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1676"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_jumponr" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1677"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_kick" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1678"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_left" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1679"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_passenger" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1680"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_pushes" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1681"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_ride" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1682"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_right" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1683"
            GOSUB wayfarer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wf_still" "WAYFARER") (framedelta loop lockX lockY lockF) time
            GOSUB wayfarer_anims_unload
        ELSE
        IF TEST_CHEAT "Z1684"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_1h_lift" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1685"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_1h_lift_end" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1686"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_1h_ret" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1687"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_1h_ret_s" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1688"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_2h_lift" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1689"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_2h_lift_end" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1690"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_2h_ret" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1691"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_2h_ret_s" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1692"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_ar_lift" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1693"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_ar_lift_end" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1694"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_ar_ret" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1695"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_ar_ret_s" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1696"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_g_lift_in" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1697"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_g_lift_out" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1698"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_in" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1699"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_out" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1700"
            GOSUB weapons_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_pose" "WEAPONS") (framedelta loop lockX lockY lockF) time
            GOSUB weapons_anims_unload
        ELSE
        IF TEST_CHEAT "Z1701"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cs_dead_guy" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1702"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cs_plyr_pt1" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1703"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cs_plyr_pt2" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1704"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cs_wuzi_pt1" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1705"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cs_wuzi_pt2" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1706"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("walkstart_idle_01" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1707"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_follow" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1708"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_greet_plyr" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1709"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_greet_wuzi" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1710"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_grnd_chk" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1711"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_stand_loop" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1712"
            GOSUB wuzi_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wuzi_walk" "WUZI") (framedelta loop lockX lockY lockF) time
            GOSUB wuzi_anims_unload
        ELSE
        IF TEST_CHEAT "Z1713"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b1" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1714"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b2" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1715"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b3" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1716"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b4" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1717"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b5" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1718"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b6" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1719"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b7" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1720"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b8" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1721"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b9" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1722"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b10" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1723"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b11" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1724"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b12" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1725"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b13" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1726"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b14" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1727"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b15" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1728"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b16" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1729"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g1" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1730"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g2" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1731"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g3" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1732"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g4" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1733"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g5" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1734"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g6" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1735"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g7" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1736"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g8" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1737"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g9" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1738"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g10" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1739"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g11" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1740"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g12" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1741"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g13" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1742"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g14" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1743"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g15" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1744"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g16" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1745"
            GOSUB wop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_loop" "WOP") (framedelta loop lockX lockY lockF) time
            GOSUB wop_anims_unload
        ELSE
        IF TEST_CHEAT "Z1746"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b1" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1747"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b2" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1748"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b3" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1749"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b4" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1750"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b5" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1751"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b6" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1752"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b7" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1753"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b8" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1754"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b9" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1755"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b10" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1756"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b11" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1757"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b12" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1758"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b13" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1759"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b14" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1760"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b15" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1761"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b16" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1762"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g1" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1763"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g2" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1764"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g3" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1765"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g4" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1766"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g5" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1767"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g6" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1768"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g7" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1769"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g8" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1770"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g9" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1771"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g10" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1772"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g11" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1773"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g12" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1774"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g13" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1775"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g14" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1776"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g15" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1777"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g16" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1778"
            GOSUB gfunk_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_loop" "GFUNK") (framedelta loop lockX lockY lockF) time
            GOSUB gfunk_anims_unload
        ELSE
        IF TEST_CHEAT "Z1779"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b1" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1780"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b2" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1781"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b3" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1782"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b4" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1783"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b5" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1784"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b6" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1785"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b7" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1786"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b8" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1787"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b9" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1788"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b10" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1789"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b11" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1790"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b12" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1791"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b13" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1792"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b14" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1793"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b15" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1794"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_b16" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1795"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g1" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1796"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g2" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1797"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g3" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1798"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g4" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1799"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g5" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1800"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g6" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1801"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g7" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1802"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g8" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1803"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g9" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1804"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g10" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1805"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g11" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1806"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g12" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1807"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g13" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1808"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g14" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1809"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g15" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1810"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_g16" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1811"
            GOSUB runningman_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_loop" "RUNNINGMAN") (framedelta loop lockX lockY lockF) time
            GOSUB runningman_anims_unload
        ELSE
        IF TEST_CHEAT "Z1812"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_end_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1813"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_end_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1814"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_loop_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1815"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_loop_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1816"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_start_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1817"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_car_start_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1818"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_end_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1819"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_end_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1820"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_loop_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1821"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_loop_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1822"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_start_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1823"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_couch_start_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1824"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_end_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1825"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_end_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1826"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_loop_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1827"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_loop_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1828"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_start_p" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1829"
            GOSUB blowjobz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bj_stand_start_w" "BLOWJOBZ") (framedelta loop lockX lockY lockF) time
            GOSUB blowjobz_anims_unload
        ELSE
        IF TEST_CHEAT "Z1830"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_caned_idle_p" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1831"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_caned_idle_w" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1832"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_caned_p" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1833"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_caned_w" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1834"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_cane_idle_p" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1835"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_cane_idle_w" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1836"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_cane_p" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1837"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("snm_cane_w" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1838"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spankedp" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1839"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spankedw" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1840"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanked_idlep" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1841"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanked_idlew" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1842"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spankingp" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1843"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spankingw" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1844"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_endp" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1845"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_endw" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1846"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_idlep" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1847"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_idlew" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1848"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_sittingidlep" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1849"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_sittingidlew" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1850"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spanking_sittingp" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1851"
            GOSUB snm_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("Spanking_SittingW" "SNM") (framedelta loop lockX lockY lockF) time
            GOSUB snm_anims_unload
        ELSE
        IF TEST_CHEAT "Z1852"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1to2_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1853"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1to2_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1854"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_cum_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1855"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_cum_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1856"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_fail_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1857"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_fail_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1858"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1859"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_1_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1860"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2to3_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1861"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2to3_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1862"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2_fail_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1863"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2_fail_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1864"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1865"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_2_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1866"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3to1_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1867"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3to1_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1868"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3_fail_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1869"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3_fail_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1870"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3_p" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1871"
            GOSUB sex_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sex_3_w" "SEX") (framedelta loop lockX lockY lockF) time
            GOSUB sex_anims_unload
        ELSE
        IF TEST_CHEAT "Z1872"
            GOSUB samp_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fishingIdle" "SAMP") (framedelta loop lockX lockY lockF) time
            GOSUB samp_anims_unload
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF

    ENDWHILE

    ped_anims_load:
        REQUEST_ANIMATION PED
        WHILE NOT HAS_ANIMATION_LOADED PED
            WAIT 0
        ENDWHILE
        RETURN

    playerdvbys_anims_load:
        REQUEST_ANIMATION PLAYER_DVBYS
        WHILE NOT HAS_ANIMATION_LOADED PLAYER_DVBYS
            WAIT 0
        ENDWHILE
        RETURN

    playidles_anims_load:
        REQUEST_ANIMATION PLAYIDLES
        WHILE NOT HAS_ANIMATION_LOADED PLAYIDLES
            WAIT 0
        ENDWHILE
        RETURN

    police_anims_load:
        REQUEST_ANIMATION POLICE
        WHILE NOT HAS_ANIMATION_LOADED POLICE
            WAIT 0
        ENDWHILE
        RETURN

    pool_anims_load:
        REQUEST_ANIMATION POOL
        WHILE NOT HAS_ANIMATION_LOADED POOL
            WAIT 0
        ENDWHILE
        RETURN

    poor_anims_load:
        REQUEST_ANIMATION POOR
        WHILE NOT HAS_ANIMATION_LOADED POOR
            WAIT 0
        ENDWHILE
        RETURN

    python_anims_load:
        REQUEST_ANIMATION PYTHON
        WHILE NOT HAS_ANIMATION_LOADED PYTHON
            WAIT 0
        ENDWHILE
        RETURN

    quad_anims_load:
        REQUEST_ANIMATION QUAD
        WHILE NOT HAS_ANIMATION_LOADED QUAD
            WAIT 0
        ENDWHILE
        RETURN

    quaddbz_anims_load:
        REQUEST_ANIMATION QUAD_DBZ
        WHILE NOT HAS_ANIMATION_LOADED QUAD_DBZ
            WAIT 0
        ENDWHILE
        RETURN

    rapping_anims_load:
        REQUEST_ANIMATION RAPPING
        WHILE NOT HAS_ANIMATION_LOADED RAPPING
            WAIT 0
        ENDWHILE
        RETURN

    rifle_anims_load:
        REQUEST_ANIMATION RIFLE
        WHILE NOT HAS_ANIMATION_LOADED RIFLE
            WAIT 0
        ENDWHILE
        RETURN

    riot_anims_load:
        REQUEST_ANIMATION RIOT
        WHILE NOT HAS_ANIMATION_LOADED RIOT
            WAIT 0
        ENDWHILE
        RETURN

    robbank_anims_load:
        REQUEST_ANIMATION ROB_BANK
        WHILE NOT HAS_ANIMATION_LOADED ROB_BANK
            WAIT 0
        ENDWHILE
        RETURN

    rocket_anims_load:
        REQUEST_ANIMATION ROCKET
        WHILE NOT HAS_ANIMATION_LOADED ROCKET
            WAIT 0
        ENDWHILE
        RETURN

    rustler_anims_load:
        REQUEST_ANIMATION RUSTLER
        WHILE NOT HAS_ANIMATION_LOADED RUSTLER
            WAIT 0
        ENDWHILE
        RETURN

    ryder_anims_load:
        REQUEST_ANIMATION RYDER
        WHILE NOT HAS_ANIMATION_LOADED RYDER
            WAIT 0
        ENDWHILE
        RETURN

    scratching_anims_load:
        REQUEST_ANIMATION SCRATCHING
        WHILE NOT HAS_ANIMATION_LOADED SCRATCHING
            WAIT 0
        ENDWHILE
        RETURN

    shamal_anims_load:
        REQUEST_ANIMATION SHAMAL
        WHILE NOT HAS_ANIMATION_LOADED SHAMAL
            WAIT 0
        ENDWHILE
        RETURN

    shop_anims_load:
        REQUEST_ANIMATION SHOP
        WHILE NOT HAS_ANIMATION_LOADED SHOP
            WAIT 0
        ENDWHILE
        RETURN

    shotgun_anims_load:
        REQUEST_ANIMATION SHOTGUN
        WHILE NOT HAS_ANIMATION_LOADED SHOTGUN
            WAIT 0
        ENDWHILE
        RETURN

    silenced_anims_load:
        REQUEST_ANIMATION SILENCED
        WHILE NOT HAS_ANIMATION_LOADED SILENCED
            WAIT 0
        ENDWHILE
        RETURN

    skate_anims_load:
        REQUEST_ANIMATION SKATE
        WHILE NOT HAS_ANIMATION_LOADED SKATE
            WAIT 0
        ENDWHILE
        RETURN

    smoking_anims_load:
        REQUEST_ANIMATION SMOKING
        WHILE NOT HAS_ANIMATION_LOADED SMOKING
            WAIT 0
        ENDWHILE
        RETURN

    sniper_anims_load:
        REQUEST_ANIMATION SNIPER
        WHILE NOT HAS_ANIMATION_LOADED SNIPER
            WAIT 0
        ENDWHILE
        RETURN

    spraycan_anims_load:
        REQUEST_ANIMATION SPRAYCAN
        WHILE NOT HAS_ANIMATION_LOADED SPRAYCAN
            WAIT 0
        ENDWHILE
        RETURN

    strip_anims_load:
        REQUEST_ANIMATION STRIP
        WHILE NOT HAS_ANIMATION_LOADED STRIP
            WAIT 0
        ENDWHILE
        RETURN

    sunbathe_anims_load:
        REQUEST_ANIMATION SUNBATHE
        WHILE NOT HAS_ANIMATION_LOADED SUNBATHE
            WAIT 0
        ENDWHILE
        RETURN

    swat_anims_load:
        REQUEST_ANIMATION SWAT
        WHILE NOT HAS_ANIMATION_LOADED SWAT
            WAIT 0
        ENDWHILE
        RETURN

    sweet_anims_load:
        REQUEST_ANIMATION SWEET
        WHILE NOT HAS_ANIMATION_LOADED SWEET
            WAIT 0
        ENDWHILE
        RETURN

    swim_anims_load:
        REQUEST_ANIMATION SWIM
        WHILE NOT HAS_ANIMATION_LOADED SWIM
            WAIT 0
        ENDWHILE
        RETURN

    sword_anims_load:
        REQUEST_ANIMATION SWORD
        WHILE NOT HAS_ANIMATION_LOADED SWORD
            WAIT 0
        ENDWHILE
        RETURN

    tank_anims_load:
        REQUEST_ANIMATION TANK
        WHILE NOT HAS_ANIMATION_LOADED TANK
            WAIT 0
        ENDWHILE
        RETURN

    tattoos_anims_load:
        REQUEST_ANIMATION TATTOOS
        WHILE NOT HAS_ANIMATION_LOADED TATTOOS
            WAIT 0
        ENDWHILE
        RETURN

    tec_anims_load:
        REQUEST_ANIMATION TEC
        WHILE NOT HAS_ANIMATION_LOADED TEC
            WAIT 0
        ENDWHILE
        RETURN

    train_anims_load:
        REQUEST_ANIMATION TRAIN
        WHILE NOT HAS_ANIMATION_LOADED TRAIN
            WAIT 0
        ENDWHILE
        RETURN

    truck_anims_load:
        REQUEST_ANIMATION TRUCK
        WHILE NOT HAS_ANIMATION_LOADED TRUCK
            WAIT 0
        ENDWHILE
        RETURN

    uzi_anims_load:
        REQUEST_ANIMATION UZI
        WHILE NOT HAS_ANIMATION_LOADED UZI
            WAIT 0
        ENDWHILE
        RETURN

    van_anims_load:
        REQUEST_ANIMATION VAN
        WHILE NOT HAS_ANIMATION_LOADED VAN
            WAIT 0
        ENDWHILE
        RETURN

    vending_anims_load:
        REQUEST_ANIMATION VENDING
        WHILE NOT HAS_ANIMATION_LOADED VENDING
            WAIT 0
        ENDWHILE
        RETURN

    vortex_anims_load:
        REQUEST_ANIMATION VORTEX
        WHILE NOT HAS_ANIMATION_LOADED VORTEX
            WAIT 0
        ENDWHILE
        RETURN

    wayfarer_anims_load:
        REQUEST_ANIMATION WAYFARER
        WHILE NOT HAS_ANIMATION_LOADED WAYFARER
            WAIT 0
        ENDWHILE
        RETURN

    weapons_anims_load:
        REQUEST_ANIMATION WEAPONS
        WHILE NOT HAS_ANIMATION_LOADED WEAPONS
            WAIT 0
        ENDWHILE
        RETURN

    wuzi_anims_load:
        REQUEST_ANIMATION WUZI
        WHILE NOT HAS_ANIMATION_LOADED WUZI
            WAIT 0
        ENDWHILE
        RETURN

    blowjobz_anims_load:
        REQUEST_ANIMATION BLOWJOBZ
        WHILE NOT HAS_ANIMATION_LOADED BLOWJOBZ
            WAIT 0
        ENDWHILE
        RETURN

    gfunk_anims_load:
        REQUEST_ANIMATION GFUNK
        WHILE NOT HAS_ANIMATION_LOADED GFUNK
            WAIT 0
        ENDWHILE
        RETURN

    runningman_anims_load:
        REQUEST_ANIMATION RUNNINGMAN
        WHILE NOT HAS_ANIMATION_LOADED RUNNINGMAN
            WAIT 0
        ENDWHILE
        RETURN

    samp_anims_load:
        REQUEST_ANIMATION SAMP
        WHILE NOT HAS_ANIMATION_LOADED SAMP
            WAIT 0
        ENDWHILE
        RETURN

    sex_anims_load:
        REQUEST_ANIMATION SEX
        WHILE NOT HAS_ANIMATION_LOADED SEX
            WAIT 0
        ENDWHILE
        RETURN

    snm_anims_load:
        REQUEST_ANIMATION SNM
        WHILE NOT HAS_ANIMATION_LOADED SNM
            WAIT 0
        ENDWHILE
        RETURN

    wop_anims_load:
        REQUEST_ANIMATION WOP
        WHILE NOT HAS_ANIMATION_LOADED WOP
            WAIT 0
        ENDWHILE
        RETURN

    ped_anims_unload:
        REMOVE_ANIMATION PED
        RETURN

    playerdvbys_anims_unload:
        REMOVE_ANIMATION PLAYER_DVBYS
        RETURN

    playidles_anims_unload:
        REMOVE_ANIMATION PLAYIDLES
        RETURN

    police_anims_unload:
        REMOVE_ANIMATION POLICE
        RETURN

    pool_anims_unload:
        REMOVE_ANIMATION POOL
        RETURN

    poor_anims_unload:
        REMOVE_ANIMATION POOR
        RETURN

    python_anims_unload:
        REMOVE_ANIMATION PYTHON
        RETURN

    quad_anims_unload:
        REMOVE_ANIMATION QUAD
        RETURN

    quaddbz_anims_unload:
        REMOVE_ANIMATION QUAD_DBZ
        RETURN

    rapping_anims_unload:
        REMOVE_ANIMATION RAPPING
        RETURN

    rifle_anims_unload:
        REMOVE_ANIMATION RIFLE
        RETURN

    riot_anims_unload:
        REMOVE_ANIMATION RIOT
        RETURN

    robbank_anims_unload:
        REMOVE_ANIMATION ROB_BANK
        RETURN

    rocket_anims_unload:
        REMOVE_ANIMATION ROCKET
        RETURN

    rustler_anims_unload:
        REMOVE_ANIMATION RUSTLER
        RETURN

    ryder_anims_unload:
        REMOVE_ANIMATION RYDER
        RETURN

    scratching_anims_unload:
        REMOVE_ANIMATION SCRATCHING
        RETURN

    shamal_anims_unload:
        REMOVE_ANIMATION SHAMAL
        RETURN

    shop_anims_unload:
        REMOVE_ANIMATION SHOP
        RETURN

    shotgun_anims_unload:
        REMOVE_ANIMATION SHOTGUN
        RETURN

    silenced_anims_unload:
        REMOVE_ANIMATION SILENCED
        RETURN

    skate_anims_unload:
        REMOVE_ANIMATION SKATE
        RETURN

    smoking_anims_unload:
        REMOVE_ANIMATION SMOKING
        RETURN

    sniper_anims_unload:
        REMOVE_ANIMATION SMOKING
        RETURN

    spraycan_anims_unload:
        REMOVE_ANIMATION SPRAYCAN
        RETURN

    strip_anims_unload:
        REMOVE_ANIMATION STRIP
        RETURN

    sunbathe_anims_unload:
        REMOVE_ANIMATION SUNBATHE
        RETURN

    swat_anims_unload:
        REMOVE_ANIMATION SWAT
        RETURN

    sweet_anims_unload:
        REMOVE_ANIMATION SWEET
        RETURN

    swim_anims_unload:
        REMOVE_ANIMATION SWIM
        RETURN

    sword_anims_unload:
        REMOVE_ANIMATION SWORD
        RETURN

    tank_anims_unload:
        REMOVE_ANIMATION TANK
        RETURN

    tattoos_anims_unload:
        REMOVE_ANIMATION TATTOOS
        RETURN

    tec_anims_unload:
        REMOVE_ANIMATION TEC
        RETURN

    train_anims_unload:
        REMOVE_ANIMATION TRAIN
        RETURN

    truck_anims_unload:
        REMOVE_ANIMATION TRUCK
        RETURN

    uzi_anims_unload:
        REMOVE_ANIMATION UZI
        RETURN

    van_anims_unload:
        REMOVE_ANIMATION VAN
        RETURN

    vending_anims_unload:
        REMOVE_ANIMATION VENDING
        RETURN

    vortex_anims_unload:
        REMOVE_ANIMATION VORTEX
        RETURN

    wayfarer_anims_unload:
        REMOVE_ANIMATION WAYFARER
        RETURN

    weapons_anims_unload:
        REMOVE_ANIMATION WEAPONS
        RETURN

    wuzi_anims_unload:
        REMOVE_ANIMATION WUZI
        RETURN

    blowjobz_anims_unload:
        REMOVE_ANIMATION BLOWJOBZ
        RETURN

    gfunk_anims_unload:
        REMOVE_ANIMATION GFUNK
        RETURN

    runningman_anims_unload:
        REMOVE_ANIMATION RUNNINGMAN
        RETURN

    samp_anims_unload:
        REMOVE_ANIMATION SAMP
        RETURN

    sex_anims_unload:
        REMOVE_ANIMATION SEX
        RETURN

    snm_anims_unload:
        REMOVE_ANIMATION SNM
        RETURN

    wop_anims_unload:
        REMOVE_ANIMATION WOP
        RETURN
}
SCRIPT_END