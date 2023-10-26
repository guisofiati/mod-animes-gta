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
        IF TEST_CHEAT "Z1"
            GOSUB airport_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("thrw_barl_thrw" "AIRPORT") (framedelta loop lockX lockY lockF) time
            GOSUB airport_anims_unload
        ELSE
        IF TEST_CHEAT "Z2"
            GOSUB attractors_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("stepsit_in" "ATTRACTORS") (framedelta loop lockX lockY lockF) time
            GOSUB attractors_anims_unload
        ELSE
        IF TEST_CHEAT "Z3"
            GOSUB attractors_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("stepsit_loop" "ATTRACTORS") (framedelta loop lockX lockY lockF) time
            GOSUB attractors_anims_unload
        ELSE
        IF TEST_CHEAT "Z4"
            GOSUB attractors_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("stepsit_out" "ATTRACTORS") (framedelta loop lockX lockY lockF) time
            GOSUB attractors_anims_unload
        ELSE
        IF TEST_CHEAT "Z5"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barcustom_get" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z6"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barcustom_loop" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z7"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barcustom_order" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z8"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barman_idle" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z9"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_bottle" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z10"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_give" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z11"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_glass" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z12"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_in" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z13"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_loop" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z14"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("barserve_order" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z15"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnk_stndf_loop" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z16"
            GOSUB bar_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnk_stndm_loop" "BAR") (framedelta loop lockX lockY lockF) time
            GOSUB bar_anims_unload
        ELSE
        IF TEST_CHEAT "Z17"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_1" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z18"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_2" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z19"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_3" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z20"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_4" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z21"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_block" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z22"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_hit_1" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z23"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_hit_2" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z24"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_hit_3" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z25"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_idle" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z26"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_m" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z27"
            GOSUB baseball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bat_part" "BASEBALL") (framedelta loop lockX lockY lockF) time
            GOSUB baseball_anims_unload
        ELSE
        IF TEST_CHEAT "Z28"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_fire1" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z29"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_fire2" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z30"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_fire3" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z31"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_gf_wave" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z32"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_panic_01" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z33"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_panic_02" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z34"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_panic_03" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z35"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_panic_04" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z36"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_panic_loop" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z37"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grlfrd_kiss_03" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z38"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smklean_loop" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z39"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("playa_kiss_03" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z40"
            GOSUB bdfire_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wash_up" "BD_FIRE") (framedelta loop lockX lockY lockF) time
            GOSUB bdfire_anims_unload
        ELSE
        IF TEST_CHEAT "Z41"
            GOSUB beach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bather" "BEACH") (framedelta loop lockX lockY lockF) time
            GOSUB beach_anims_unload
        ELSE
        IF TEST_CHEAT "Z42"
            GOSUB beach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lay_bac_loop" "BEACH") (framedelta loop lockX lockY lockF) time
            GOSUB beach_anims_unload
        ELSE
        IF TEST_CHEAT "Z43"
            GOSUB beach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_m_loop" "BEACH") (framedelta loop lockX lockY lockF) time
            GOSUB beach_anims_unload
        ELSE
        IF TEST_CHEAT "Z44"
            GOSUB beach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("parksit_w_loop" "BEACH") (framedelta loop lockX lockY lockF) time
            GOSUB beach_anims_unload
        ELSE
        IF TEST_CHEAT "Z45"
            GOSUB beach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sitnwait_loop_w" "BEACH") (framedelta loop lockX lockY lockF) time
            GOSUB beach_anims_unload
        ELSE
        IF TEST_CHEAT "Z46"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_celebrate" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z47"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_down" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z48"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_getoff" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z49"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_geton" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z50"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_up_a" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z51"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_up_b" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z52"
            GOSUB benchpress_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bp_up_smooth" "BENCHPRESS") (framedelta loop lockX lockY lockF) time
            GOSUB benchpress_anims_unload
        ELSE
        IF TEST_CHEAT "Z53"
            GOSUB bfinjection_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bf_getin_lhs" "BF_INJECTION") (framedelta loop lockX lockY lockF) time
            GOSUB bfinjection_anims_unload
        ELSE
        IF TEST_CHEAT "Z54"
            GOSUB bfinjection_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bf_getin_rhs" "BF_INJECTION") (framedelta loop lockX lockY lockF) time
            GOSUB bfinjection_anims_unload
        ELSE
        IF TEST_CHEAT "Z55"
            GOSUB bfinjection_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bf_getout_lhs" "BF_INJECTION") (framedelta loop lockX lockY lockF) time
            GOSUB bfinjection_anims_unload
        ELSE
        IF TEST_CHEAT "Z56"
            GOSUB bfinjection_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bf_getout_rhs" "BF_INJECTION") (framedelta loop lockX lockY lockF) time
            GOSUB bfinjection_anims_unload
        ELSE
        IF TEST_CHEAT "Z57"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_back" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z58"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_drivebyft" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z59"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_drivebylhs" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z60"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_drivebyrhs" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z61"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_fwd" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z62"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_getoffback" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z63"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_getofflhs" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z64"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_getoffrhs" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z65"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_hit" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z66"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_jumponl" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z67"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_jumponr" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z68"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_kick" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z69"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_left" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z70"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_passenger" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z71"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_pushes" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z72"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_ride" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z73"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_right" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z74"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_shuffle" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z75"
            GOSUB biked_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("biked_still" "BIKED") (framedelta loop lockX lockY lockF) time
            GOSUB biked_anims_unload
        ELSE
        IF TEST_CHEAT "Z76"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_back" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z77"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_drivebyft" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z78"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_drivebylhs" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z79"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_drivebyrhs" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z80"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_fwd" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z81"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_getoffback" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z82"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_getofflhs" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z83"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_getoffrhs" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z84"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_hit" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z85"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_jumponl" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z86"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_jumponr" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z87"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_kick" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z88"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_left" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z89"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_passenger" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z90"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_pushes" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z91"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_ride" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z92"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_right" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z93"
            GOSUB bikeh_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikeh_still" "BIKEH") (framedelta loop lockX lockY lockF) time
            GOSUB bikeh_anims_unload
        ELSE
        IF TEST_CHEAT "Z94"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bk_blnce_in" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z95"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bk_blnce_out" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z96"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bk_jmp" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z97"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bk_rdy_in" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z98"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bk_rdy_out" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z99"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("struggle_cesar" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z100"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("struggle_driver" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z101"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_driver" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z102"
            GOSUB bikeleap_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("truck_getin" "BIKELEAP") (framedelta loop lockX lockY lockF) time
            GOSUB bikeleap_anims_unload
        ELSE
        IF TEST_CHEAT "Z103"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_back" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z104"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_drivebyft" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z105"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_drivebylhs" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z106"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_drivebyrhs" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z107"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_fwd" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z108"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_getoffback" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z109"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_getofflhs" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z110"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_getoffrhs" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z111"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_hit" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z112"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_jumponl" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z113"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_jumponr" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z114"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_kick" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z115"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_left" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z116"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_passenger" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z117"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_pushes" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z118"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_ride" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z119"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_right" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z120"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_snatch_l" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z121"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_snatch_r" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z122"
            GOSUB bikes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikes_still" "BIKES") (framedelta loop lockX lockY lockF) time
            GOSUB bikes_anims_unload
        ELSE
        IF TEST_CHEAT "Z123"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_back" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z124"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_drivebyft" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z125"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_drivebylhs" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z126"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_drivebyrhs" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z127"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_fwd" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z128"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_getoffback" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z129"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_getofflhs" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z130"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_getoffrhs" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z131"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_hit" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z132"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_jumponl" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z133"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_jumponr" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z134"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_kick" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z135"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_left" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z136"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_passenger" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z137"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_pushes" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z138"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_ride" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z139"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_right" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z140"
            GOSUB bikev_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bikev_still" "BIKEV") (framedelta loop lockX lockY lockF) time
            GOSUB bikev_anims_unload
        ELSE
        IF TEST_CHEAT "Z141"
            GOSUB bikedbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_bwd" "BIKE_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB bikedbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z142"
            GOSUB bikedbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_fwd" "BIKE_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB bikedbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z143"
            GOSUB bikedbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_lhs" "BIKE_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB bikedbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z144"
            GOSUB bikedbz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_driveby_rhs" "BIKE_DBZ") (framedelta loop lockX lockY lockF) time
            GOSUB bikedbz_anims_unload
        ELSE
        IF TEST_CHEAT "Z145"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_back" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z146"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_bunnyhop" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z147"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_drivebyft" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z148"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_driveby_lhs" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z149"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_driveby_rhs" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z150"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_fwd" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z151"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_getoffback" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z152"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_getofflhs" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z153"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_getoffrhs" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z154"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_jumponl" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z155"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_jumponr" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z156"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_left" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z157"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_pedal" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z158"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_pushes" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z159"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_ride" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z160"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_right" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z161"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_sprint" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z162"
            GOSUB bmx_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_still" "BMX") (framedelta loop lockX lockY lockF) time
            GOSUB bmx_anims_unload
        ELSE
        IF TEST_CHEAT "Z163"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z164"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant_2idle" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z165"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant_crouch_in" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z166"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant_crouch_out" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z167"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant_in" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z168"
            GOSUB bomber_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bom_plant_loop" "BOMBER") (framedelta loop lockX lockY lockF) time
            GOSUB bomber_anims_unload
        ELSE
        IF TEST_CHEAT "Z169"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("boxhipin" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z170"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("boxhipup" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z171"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("boxshdwn" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z172"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("boxshup" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z173"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bxhipwlk" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z174"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bxhwlki" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z175"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bxshwlk" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z176"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bxshwlki" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z177"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bxwlko" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z178"
            GOSUB box_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("catch_box" "BOX") (framedelta loop lockX lockY lockF) time
            GOSUB box_anims_unload
        ELSE
        IF TEST_CHEAT "Z179"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_def_jump_shot" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z180"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_def_loop" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z181"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_def_stepl" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z182"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_def_stepr" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z183"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z184"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_gli" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z185"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_gli_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z186"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_lnch" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z187"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_lnch_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z188"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_lnd" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z189"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_dnk_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z190"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idle" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z191"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idle2" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z192"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idle2_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z193"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idleloop" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z194"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idleloop_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z195"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_idle_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z196"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_jump_cancel" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z197"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_jump_cancel_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z198"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_jump_end" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z199"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_jump_shot" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z200"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_jump_shot_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z201"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_net_dnk_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z202"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_pickup" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z203"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_pickup_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z204"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_react_miss" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z205"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_react_score" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z206"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_run" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z207"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_run_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z208"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_skidstop_l" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z209"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_skidstop_l_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z210"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_skidstop_r" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z211"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_skidstop_r_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z212"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walk" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z213"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walkstop_l" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z214"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walkstop_l_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z215"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walkstop_r" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z216"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walkstop_r_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z217"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walk_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z218"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walk_start" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z219"
            GOSUB bsktball_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bball_walk_start_o" "BSKTBALL") (framedelta loop lockX lockY lockF) time
            GOSUB bsktball_anims_unload
        ELSE
        IF TEST_CHEAT "Z220"
            GOSUB buddy_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("buddy_crouchfire" "BUDDY") (framedelta loop lockX lockY lockF) time
            GOSUB buddy_anims_unload
        ELSE
        IF TEST_CHEAT "Z221"
            GOSUB buddy_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("buddy_crouchreload" "BUDDY") (framedelta loop lockX lockY lockF) time
            GOSUB buddy_anims_unload
        ELSE
        IF TEST_CHEAT "Z222"
            GOSUB buddy_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("buddy_fire" "BUDDY") (framedelta loop lockX lockY lockF) time
            GOSUB buddy_anims_unload
        ELSE
        IF TEST_CHEAT "Z223"
            GOSUB buddy_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("buddy_fire_poor" "BUDDY") (framedelta loop lockX lockY lockF) time
            GOSUB buddy_anims_unload
        ELSE
        IF TEST_CHEAT "Z224"
            GOSUB buddy_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("buddy_reload" "BUDDY") (framedelta loop lockX lockY lockF) time
            GOSUB buddy_anims_unload
        ELSE
        IF TEST_CHEAT "Z225"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_close" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z226"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_getin_lhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z227"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_getin_rhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z228"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_getout_lhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z229"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_getout_rhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z230"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_jacked_lhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z231"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_open" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z232"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_open_rhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z233"
            GOSUB bus_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bus_pullout_lhs" "BUS") (framedelta loop lockX lockY lockF) time
            GOSUB bus_anims_unload
        ELSE
        IF TEST_CHEAT "Z234"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camcrch_cmon" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z235"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camcrch_idleloop" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z236"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camcrch_stay" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z237"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camcrch_to_camstnd" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z238"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camstnd_cmon" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z239"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camstnd_idleloop" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z240"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camstnd_lkabt" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z241"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("camstnd_to_camcrch" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z242"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piccrch_in" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z243"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piccrch_out" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z244"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piccrch_take" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z245"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("picstnd_in" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z246"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("picstnd_out" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z247"
            GOSUB camera_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("picstnd_take" "CAMERA") (framedelta loop lockX lockY lockF) time
            GOSUB camera_anims_unload
        ELSE
        IF TEST_CHEAT "Z248"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fixn_car_loop" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z249"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fixn_car_out" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z250"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flag_drop" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z251"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sit_relaxed" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z252"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tap_hand" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z253"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_bump" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z254"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_high" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z255"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_low" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z256"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_med" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z257"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_turnl" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z258"
            GOSUB car_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tyd2car_turnr" "CAR") (framedelta loop lockX lockY lockF) time
            GOSUB car_anims_unload
        ELSE
        IF TEST_CHEAT "Z259"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crry_prtial" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z260"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("liftup" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z261"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("liftup05" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z262"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("liftup105" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z263"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("putdwn" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z264"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("putdwn05" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z265"
            GOSUB carry_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("putdwn105" "CARRY") (framedelta loop lockX lockY lockF) time
            GOSUB carry_anims_unload
        ELSE
        IF TEST_CHEAT "Z266"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_in" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z267"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_loopa" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z268"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_loopa_to_b" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z269"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_loopb" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z270"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_loopb_to_a" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z271"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carfone_out" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z272"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc1_bl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z273"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc1_br" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z274"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc1_fl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z275"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc1_fr" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z276"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc2_fl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z277"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc3_br" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z278"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc3_fl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z279"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc3_fr" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z280"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc4_bl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z281"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc4_br" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z282"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc4_fl" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z283"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_sc4_fr" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z284"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_talkm_in" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z285"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_talkm_loop" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z286"
            GOSUB carchat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("car_talkm_out" "CAR_CHAT") (framedelta loop lockX lockY lockF) time
            GOSUB carchat_anims_unload
        ELSE
        IF TEST_CHEAT "Z287"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_in" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z288"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_loop" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z289"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_lose" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z290"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_out" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z291"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_pick_01" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z292"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_pick_02" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z293"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_raise" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z294"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cards_win" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z295"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealone" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z296"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("manwinb" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z297"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("manwind" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z298"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_bet" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z299"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_in" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z300"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_loop" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z301"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_lose" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z302"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_out" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z303"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("roulette_win" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z304"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_bet_01" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z305"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_bet_02" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z306"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_in" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z307"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_lose_out" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z308"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_plyr" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z309"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_wait" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z310"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("slot_win_out" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z311"
            GOSUB casino_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wof" "CASINO") (framedelta loop lockX lockY lockF) time
            GOSUB casino_anims_unload
        ELSE
        IF TEST_CHEAT "Z312"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_1" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z313"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_2" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z314"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_3" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z315"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_g" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z316"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_hit_1" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z317"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_hit_2" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z318"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_hit_3" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z319"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("csaw_part" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z320"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_csaw" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z321"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_csaw" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z322"
            GOSUB chainsaw_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_csawlo" "CHAINSAW") (framedelta loop lockX lockY lockF) time
            GOSUB chainsaw_anims_unload
        ELSE
        IF TEST_CHEAT "Z323"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_back" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z324"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_bunnyhop" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z325"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_drivebyft" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z326"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_driveby_lhs" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z327"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_driveby_rhs" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z328"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_fwd" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z329"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_getoffback" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z330"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_getofflhs" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z331"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_getoffrhs" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z332"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_jumponl" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z333"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_jumponr" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z334"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_left" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z335"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_pedal" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z336"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_pushes" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z337"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_ride" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z338"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_right" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z339"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_sprint" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z340"
            GOSUB choppa_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("choppa_still" "CHOPPA") (framedelta loop lockX lockY lockF) time
            GOSUB choppa_anims_unload
        ELSE
        IF TEST_CHEAT "Z341"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_buy" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z342"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_in" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z343"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_out" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z344"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_hat" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z345"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_in" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z346"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_in_o" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z347"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_legs" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z348"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_loop" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z349"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_out" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z350"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_out_o" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z351"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_shoes" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z352"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_torso" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z353"
            GOSUB clothes_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("clo_pose_watch" "CLOTHES") (framedelta loop lockX lockY lockF) time
            GOSUB clothes_anims_unload
        ELSE
        IF TEST_CHEAT "Z354"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_inl" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z355"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_inr" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z356"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_opnl" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z357"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_opnr" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z358"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_outl" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z359"
            GOSUB coach_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coach_outr" "COACH") (framedelta loop lockX lockY lockF) time
            GOSUB coach_anims_unload
        ELSE
        IF TEST_CHEAT "Z360"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("2guns_crouchfire" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z361"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("colt45_crouchfire" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z362"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("colt45_crouchreload" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z363"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("colt45_fire" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z364"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("colt45_fire_2hands" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z365"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("colt45_reload" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z366"
            GOSUB colt45_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sawnoff_reload" "COLT45") (framedelta loop lockX lockY lockF) time
            GOSUB colt45_anims_unload
        ELSE
        IF TEST_CHEAT "Z367"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("copbrowse_in" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z368"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("copbrowse_loop" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z369"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("copbrowse_nod" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z370"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("copbrowse_out" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z371"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("copbrowse_shake" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z372"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_in" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z373"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_loop" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z374"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_nod" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z375"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_out" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z376"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_shake" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z377"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_think" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z378"
            GOSUB copambient_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("coplook_watch" "COP_AMBIENT") (framedelta loop lockX lockY lockF) time
            GOSUB copambient_anims_unload
        ELSE
        IF TEST_CHEAT "Z379"
            GOSUB copdvbyz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_dvby_b" "COP_DVBYZ") (framedelta loop lockX lockY lockF) time
            GOSUB copdvbyz_anims_unload
        ELSE
        IF TEST_CHEAT "Z380"
            GOSUB copdvbyz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_dvby_ft" "COP_DVBYZ") (framedelta loop lockX lockY lockF) time
            GOSUB copdvbyz_anims_unload
        ELSE
        IF TEST_CHEAT "Z381"
            GOSUB copdvbyz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_dvby_l" "COP_DVBYZ") (framedelta loop lockX lockY lockF) time
            GOSUB copdvbyz_anims_unload
        ELSE
        IF TEST_CHEAT "Z382"
            GOSUB copdvbyz_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cop_dvby_r" "COP_DVBYZ") (framedelta loop lockX lockY lockF) time
            GOSUB copdvbyz_anims_unload
        ELSE
        IF TEST_CHEAT "Z383"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bbalbat_idle_01" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z384"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bbalbat_idle_02" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z385"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckdeth1" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z386"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckdeth2" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z387"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckdeth3" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z388"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckdeth4" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z389"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckidle1" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z390"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckidle2" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z391"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckidle3" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z392"
            GOSUB crack_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crckidle4" "CRACK") (framedelta loop lockX lockY lockF) time
            GOSUB crack_anims_unload
        ELSE
        IF TEST_CHEAT "Z393"
            GOSUB crib_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crib_console_loop" "CRIB") (framedelta loop lockX lockY lockF) time
            GOSUB crib_anims_unload
        ELSE
        IF TEST_CHEAT "Z394"
            GOSUB crib_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crib_use_switch" "CRIB") (framedelta loop lockX lockY lockF) time
            GOSUB crib_anims_unload
        ELSE
        IF TEST_CHEAT "Z395"
            GOSUB crib_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ped_console_loop" "CRIB") (framedelta loop lockX lockY lockF) time
            GOSUB crib_anims_unload
        ELSE
        IF TEST_CHEAT "Z396"
            GOSUB crib_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ped_console_loose" "CRIB") (framedelta loop lockX lockY lockF) time
            GOSUB crib_anims_unload
        ELSE
        IF TEST_CHEAT "Z397"
            GOSUB crib_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ped_console_win" "CRIB") (framedelta loop lockX lockY lockF) time
            GOSUB crib_anims_unload
        ELSE
        IF TEST_CHEAT "Z398"
            GOSUB damjump_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_dive_loop" "DAM_JUMP") (framedelta loop lockX lockY lockF) time
            GOSUB damjump_anims_unload
        ELSE
        IF TEST_CHEAT "Z399"
            GOSUB damjump_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_land" "DAM_JUMP") (framedelta loop lockX lockY lockF) time
            GOSUB damjump_anims_unload
        ELSE
        IF TEST_CHEAT "Z400"
            GOSUB damjump_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dam_launch" "DAM_JUMP") (framedelta loop lockX lockY lockF) time
            GOSUB damjump_anims_unload
        ELSE
        IF TEST_CHEAT "Z401"
            GOSUB damjump_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("jump_roll" "DAM_JUMP") (framedelta loop lockX lockY lockF) time
            GOSUB damjump_anims_unload
        ELSE
        IF TEST_CHEAT "Z402"
            GOSUB damjump_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sf_jumpwall" "DAM_JUMP") (framedelta loop lockX lockY lockF) time
            GOSUB damjump_anims_unload
        ELSE
        IF TEST_CHEAT "Z403"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_clap" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z404"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_clap1" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z405"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dance_loop" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z406"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dan_down_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z407"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dan_left_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z408"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dan_loop_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z409"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dan_right_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z410"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dan_up_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z411"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnce_m_a" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z412"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnce_m_b" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z413"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnce_m_c" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z414"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnce_m_d" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z415"
            GOSUB dancing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dnce_m_e" "DANCING") (framedelta loop lockX lockY lockF) time
            GOSUB dancing_anims_unload
        ELSE
        IF TEST_CHEAT "Z416"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_deal" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z417"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_idle" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z418"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_idle_01" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z419"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_idle_02" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z420"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_idle_03" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z421"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drugs_buy" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z422"
            GOSUB dealer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_pay" "DEALER") (framedelta loop lockX lockY lockF) time
            GOSUB dealer_anims_unload
        ELSE
        IF TEST_CHEAT "Z423"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_1" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z424"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_2" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z425"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_3" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z426"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_block" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z427"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_g" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z428"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_hit_1" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z429"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_hit_2" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z430"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_hit_3" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z431"
            GOSUB dildo_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dildo_idle" "DILDO") (framedelta loop lockX lockY lockF) time
            GOSUB dildo_anims_unload
        ELSE
        IF TEST_CHEAT "Z432"
            GOSUB dodge_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cover_dive_01" "DODGE") (framedelta loop lockX lockY lockF) time
            GOSUB dodge_anims_unload
        ELSE
        IF TEST_CHEAT "Z433"
            GOSUB dodge_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cover_dive_02" "DODGE") (framedelta loop lockX lockY lockF) time
            GOSUB dodge_anims_unload
        ELSE
        IF TEST_CHEAT "Z434"
            GOSUB dodge_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crushed" "DODGE") (framedelta loop lockX lockY lockF) time
            GOSUB dodge_anims_unload
        ELSE
        IF TEST_CHEAT "Z435"
            GOSUB dodge_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("crush_jump" "DODGE") (framedelta loop lockX lockY lockF) time
            GOSUB dodge_anims_unload
        ELSE
        IF TEST_CHEAT "Z436"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_align_lhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z437"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_align_rhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z438"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_getin_lhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z439"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_getin_rhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z440"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_getout_lhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z441"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_getout_rhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z442"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_jacked_lhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z443"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_jacked_rhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z444"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_pullout_lhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z445"
            GOSUB dozer_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dozer_pullout_rhs" "DOZER") (framedelta loop lockX lockY lockF) time
            GOSUB dozer_anims_unload
        ELSE
        IF TEST_CHEAT "Z446"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebylhs" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z447"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebylhs_bwd" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z448"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebylhs_fwd" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z449"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebyrhs" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z450"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebyrhs_bwd" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z451"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebyrhs_fwd" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z452"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebytop_lhs" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z453"
            GOSUB drivebys_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gang_drivebytop_rhs" "DRIVEBYS") (framedelta loop lockX lockY lockF) time
            GOSUB drivebys_anims_unload
        ELSE
        IF TEST_CHEAT "Z454"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatidle" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z455"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatidle_armed" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z456"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatidle_csaw" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z457"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatidle_rocket" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z458"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatrun" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z459"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatrun_armed" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z460"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatrun_csaw" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z461"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatrun_rocket" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z462"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatsprint" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z463"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalk" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z464"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalkstart" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z465"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalkstart_csaw" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z466"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalkst_armed" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z467"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalkst_rocket" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z468"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalk_armed" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z469"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalk_csaw" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z470"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fatwalk_rocket" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z471"
            GOSUB fat_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_tired" "FAT") (framedelta loop lockX lockY lockF) time
            GOSUB fat_anims_unload
        ELSE
        IF TEST_CHEAT "Z472"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_1" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z473"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_2" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z474"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_3" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z475"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_block" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z476"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_g" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z477"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_idle" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z478"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightb_m" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z479"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitb_1" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z480"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitb_2" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z481"
            GOSUB fightb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitb_3" "FIGHT_B") (framedelta loop lockX lockY lockF) time
            GOSUB fightb_anims_unload
        ELSE
        IF TEST_CHEAT "Z482"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_1" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z483"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_2" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z484"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_3" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z485"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_block" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z486"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_blocking" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z487"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_g" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z488"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_idle" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z489"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_m" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z490"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightc_spar" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z491"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitc_1" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z492"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitc_2" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z493"
            GOSUB fightc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitc_3" "FIGHT_C") (framedelta loop lockX lockY lockF) time
            GOSUB fightc_anims_unload
        ELSE
        IF TEST_CHEAT "Z494"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_1" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z495"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_2" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z496"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_3" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z497"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_block" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z498"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_g" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z499"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_idle" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z500"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightd_m" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z501"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitd_1" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z502"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitd_2" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z503"
            GOSUB fightd_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hitd_3" "FIGHT_D") (framedelta loop lockX lockY lockF) time
            GOSUB fightd_anims_unload
        ELSE
        IF TEST_CHEAT "Z504"
            GOSUB fighte_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightkick" "FIGHT_E") (framedelta loop lockX lockY lockF) time
            GOSUB fighte_anims_unload
        ELSE
        IF TEST_CHEAT "Z505"
            GOSUB fighte_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fightkick_b" "FIGHT_E") (framedelta loop lockX lockY lockF) time
            GOSUB fighte_anims_unload
        ELSE
        IF TEST_CHEAT "Z506"
            GOSUB fighte_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_fightkick" "FIGHT_E") (framedelta loop lockX lockY lockF) time
            GOSUB fighte_anims_unload
        ELSE
        IF TEST_CHEAT "Z507"
            GOSUB fighte_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hit_fightkick_b" "FIGHT_E") (framedelta loop lockX lockY lockF) time
            GOSUB fighte_anims_unload
        ELSE
        IF TEST_CHEAT "Z508"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_climb_in" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z509"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_climbout2" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z510"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_loop" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z511"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_stomp" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z512"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_hang_l" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z513"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_hang_loop" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z514"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_hang_r" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z515"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_hang_slip" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z516"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_jump_on" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z517"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_land_car" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z518"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_land_die" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z519"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_legsup" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z520"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_legsup_l" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z521"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_legsup_loop" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z522"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_legsup_r" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z523"
            GOSUB finale_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_let_go" "FINALE") (framedelta loop lockX lockY lockF) time
            GOSUB finale_anims_unload
        ELSE
        IF TEST_CHEAT "Z524"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_climbout" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z525"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_fall" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z526"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_loop" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z527"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_shot" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z528"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop1_swing" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z529"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_cop2_climbout" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z530"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_switch_p" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z531"
            GOSUB finale2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fin_switch_s" "FINALE2") (framedelta loop lockX lockY lockF) time
            GOSUB finale2_anims_unload
        ELSE
        IF TEST_CHEAT "Z532"
            GOSUB flame_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flame_fire" "FLAME") (framedelta loop lockX lockY lockF) time
            GOSUB flame_anims_unload
        ELSE
        IF TEST_CHEAT "Z533"
            GOSUB flowers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flower_attack" "FLOWERS") (framedelta loop lockX lockY lockF) time
            GOSUB flowers_anims_unload
        ELSE
        IF TEST_CHEAT "Z534"
            GOSUB flowers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flower_attack_m" "FLOWERS") (framedelta loop lockX lockY lockF) time
            GOSUB flowers_anims_unload
        ELSE
        IF TEST_CHEAT "Z535"
            GOSUB flowers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("flower_hit" "FLOWERS") (framedelta loop lockX lockY lockF) time
            GOSUB flowers_anims_unload
        ELSE
        IF TEST_CHEAT "Z536"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("eat_burger" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z537"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("eat_chicken" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z538"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("eat_pizza" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z539"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("eat_vomit_p" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z540"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("eat_vomit_sk" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z541"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_dam_bkw" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z542"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_dam_fwd" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z543"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_dam_left" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z544"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_dam_right" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z545"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_die_bkw" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z546"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_die_fwd" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z547"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_die_left" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z548"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_die_right" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z549"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_eat1" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z550"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_eat2" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z551"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_eat3" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z552"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_in" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z553"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_in_l" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z554"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_in_r" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z555"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_look" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z556"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_loop" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z557"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_out_180" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z558"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_out_l_180" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z559"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_sit_out_r_180" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z560"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_thank" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z561"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_in" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z562"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_lift" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z563"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_lift_in" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z564"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_lift_loop" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z565"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_lift_out" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z566"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_out" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z567"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_pose" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z568"
            GOSUB food_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shp_tray_return" "FOOD") (framedelta loop lockX lockY lockF) time
            GOSUB food_anims_unload
        ELSE
        IF TEST_CHEAT "Z569"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_barbell" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z570"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_a" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z571"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_b" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z572"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_celebrate" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z573"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_down" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z574"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_loop" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z575"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_pickup" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z576"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_putdown" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z577"
            GOSUB freeweights_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_free_up_smooth" "FREEWEIGHTS") (framedelta loop lockX lockY lockF) time
            GOSUB freeweights_anims_unload
        ELSE
        IF TEST_CHEAT "Z578"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_deal" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z579"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("dealer_idle" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z580"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drnkbr_prtl" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z581"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drnkbr_prtl_f" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z582"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("drugs_buy" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z583"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkaa" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z584"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkba" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z585"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkca" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z586"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkcb" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z587"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkda" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z588"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkea" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z589"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkfa" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z590"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hndshkfa_swt" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z591"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("invite_no" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z592"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("invite_yes" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z593"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("leanidle" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z594"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("leanin" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z595"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("leanout" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z596"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlka" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z597"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkb" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z598"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkc" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z599"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkd" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z600"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlke" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z601"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkf" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z602"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkg" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z603"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkh" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z604"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_hndshk_01" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z605"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_hndshk_biz_01" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z606"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shake_cara" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z607"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shake_cark" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z608"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shake_carsh" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z609"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smkcig_prtl" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z610"
            GOSUB gangs_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smkcig_prtl_f" "GANGS") (framedelta loop lockX lockY lockF) time
            GOSUB gangs_anims_unload
        ELSE
        IF TEST_CHEAT "Z611"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign1" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z612"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign1lh" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z613"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign2" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z614"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign2lh" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z615"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign3" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z616"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign3lh" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z617"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign4" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z618"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign4lh" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z619"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign5" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z620"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gsign5lh" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z621"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lhgsign1" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z622"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lhgsign2" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z623"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lhgsign3" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z624"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lhgsign4" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z625"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lhgsign5" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z626"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rhgsign1" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z627"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rhgsign2" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z628"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rhgsign3" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z629"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rhgsign4" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z630"
            GOSUB ghands_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rhgsign5" "GHANDS") (framedelta loop lockX lockY lockF) time
            GOSUB ghands_anims_unload
        ELSE
        IF TEST_CHEAT "Z631"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car2_ply" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z632"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car2_smo" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z633"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car2_swe" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z634"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car_ply" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z635"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car_ryd" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z636"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car_smo" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z637"
            GOSUB ghettodb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gdb_car_swe" "GHETTO_DB") (framedelta loop lockX lockY lockF) time
            GOSUB ghettodb_anims_unload
        ELSE
        IF TEST_CHEAT "Z638"
            GOSUB goggles_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("goggles_put_on" "GOGGLES") (framedelta loop lockX lockY lockF) time
            GOSUB goggles_anims_unload
        ELSE
        IF TEST_CHEAT "Z639"
            GOSUB graffiti_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("graffiti_chkout" "GRAFFITI") (framedelta loop lockX lockY lockF) time
            GOSUB graffiti_anims_unload
        ELSE
        IF TEST_CHEAT "Z640"
            GOSUB graffiti_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("spraycan_fire" "GRAFFITI") (framedelta loop lockX lockY lockF) time
            GOSUB graffiti_anims_unload
        ELSE
        IF TEST_CHEAT "Z641"
            GOSUB graveyard_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mrnf_loop" "GRAVEYARD") (framedelta loop lockX lockY lockF) time
            GOSUB graveyard_anims_unload
        ELSE
        IF TEST_CHEAT "Z642"
            GOSUB graveyard_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mrnm_loop" "GRAVEYARD") (framedelta loop lockX lockY lockF) time
            GOSUB graveyard_anims_unload
        ELSE
        IF TEST_CHEAT "Z643"
            GOSUB graveyard_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prst_loopa" "GRAVEYARD") (framedelta loop lockX lockY lockF) time
            GOSUB graveyard_anims_unload
        ELSE
        IF TEST_CHEAT "Z644"
            GOSUB grenade_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_start_throw" "GRENADE") (framedelta loop lockX lockY lockF) time
            GOSUB grenade_anims_unload
        ELSE
        IF TEST_CHEAT "Z645"
            GOSUB grenade_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_throw" "GRENADE") (framedelta loop lockX lockY lockF) time
            GOSUB grenade_anims_unload
        ELSE
        IF TEST_CHEAT "Z646"
            GOSUB grenade_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_throwu" "GRENADE") (framedelta loop lockX lockY lockF) time
            GOSUB grenade_anims_unload
        ELSE
        IF TEST_CHEAT "Z647"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gymshadowbox" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z648"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_celebrate" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z649"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_fast" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z650"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_faster" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z651"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_getoff" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z652"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_geton" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z653"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_pedal" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z654"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_slow" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z655"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_bike_still" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z656"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_jog_falloff" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z657"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_shadowbox" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z658"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_celebrate" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z659"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_falloff" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z660"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_getoff" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z661"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_geton" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z662"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_jog" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z663"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_sprint" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z664"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_tired" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z665"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_tread_walk" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z666"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gym_walk_falloff" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z667"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pedals_fast" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z668"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pedals_med" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z669"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pedals_slow" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z670"
            GOSUB gymnasium_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pedals_still" "GYMNASIUM") (framedelta loop lockX lockY lockF) time
            GOSUB gymnasium_anims_unload
        ELSE
        IF TEST_CHEAT "Z671"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_beard_01" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z672"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_buy" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z673"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_cut" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z674"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_cut_in" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z675"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_cut_out" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z676"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_hair_01" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z677"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_hair_02" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z678"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_in" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z679"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_loop" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z680"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_out" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z681"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_sit_in" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z682"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_sit_loop" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z683"
            GOSUB haircuts_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("brb_sit_out" "HAIRCUTS") (framedelta loop lockX lockY lockF) time
            GOSUB haircuts_anims_unload
        ELSE
        IF TEST_CHEAT "Z684"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cas_g2_gasko" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z685"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_l" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z686"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_l_back" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z687"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_r" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z688"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllpk_r_back" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z689"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_in_l" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z690"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_in_r" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z691"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_out_l" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z692"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("swt_wllshoot_out_r" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z693"
            GOSUB heist9_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("use_swipecard" "HEIST9") (framedelta loop lockX lockY lockF) time
            GOSUB heist9_anims_unload
        ELSE
        IF TEST_CHEAT "Z694"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_in_l" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z695"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_in_r" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z696"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_loop_l" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z697"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_loop_r" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z698"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_out_l" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z699"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bed_out_r" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z700"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lou_in" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z701"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lou_loop" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z702"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lou_out" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z703"
            GOSUB inthouse_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wash_up" "INT_HOUSE") (framedelta loop lockX lockY lockF) time
            GOSUB inthouse_anims_unload
        ELSE
        IF TEST_CHEAT "Z704"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("ff_dam_fwd" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z705"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_2idle_180" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z706"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_bored_loop" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z707"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_crash" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z708"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_drink" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z709"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_idle_loop" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z710"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_in" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z711"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_read" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z712"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_type_loop" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z713"
            GOSUB intoffice_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("off_sit_watch" "INT_OFFICE") (framedelta loop lockX lockY lockF) time
            GOSUB intoffice_anims_unload
        ELSE
        IF TEST_CHEAT "Z714"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_cashier" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z715"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_in" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z716"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_looka" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z717"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_lookb" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z718"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_loop" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z719"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_out" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z720"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_pay" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z721"
            GOSUB intshop_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shop_shelf" "INT_SHOP") (framedelta loop lockX lockY lockF) time
            GOSUB intshop_anims_unload
        ELSE
        IF TEST_CHEAT "Z722"
            GOSUB jstbuisness_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("girl_01" "JST_BUISNESS") (framedelta loop lockX lockY lockF) time
            GOSUB jstbuisness_anims_unload
        ELSE
        IF TEST_CHEAT "Z723"
            GOSUB jstbuisness_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("girl_02" "JST_BUISNESS") (framedelta loop lockX lockY lockF) time
            GOSUB jstbuisness_anims_unload
        ELSE
        IF TEST_CHEAT "Z724"
            GOSUB jstbuisness_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("player_01" "JST_BUISNESS") (framedelta loop lockX lockY lockF) time
            GOSUB jstbuisness_anims_unload
        ELSE
        IF TEST_CHEAT "Z725"
            GOSUB jstbuisness_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smoke_01" "JST_BUISNESS") (framedelta loop lockX lockY lockF) time
            GOSUB jstbuisness_anims_unload
        ELSE
        IF TEST_CHEAT "Z726"
            GOSUB kart_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_getin_lhs" "KART") (framedelta loop lockX lockY lockF) time
            GOSUB kart_anims_unload
        ELSE
        IF TEST_CHEAT "Z727"
            GOSUB kart_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_getin_rhs" "KART") (framedelta loop lockX lockY lockF) time
            GOSUB kart_anims_unload
        ELSE
        IF TEST_CHEAT "Z728"
            GOSUB kart_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_getout_lhs" "KART") (framedelta loop lockX lockY lockF) time
            GOSUB kart_anims_unload
        ELSE
        IF TEST_CHEAT "Z729"
            GOSUB kart_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kart_getout_rhs" "KART") (framedelta loop lockX lockY lockF) time
            GOSUB kart_anims_unload
        ELSE
        IF TEST_CHEAT "Z730"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bd_gf_wave" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z731"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gfwave2" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z732"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gf_carargue_01" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z733"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gf_carargue_02" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z734"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gf_carspot" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z735"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gf_streetargue_01" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z736"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gf_streetargue_02" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z737"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gift_get" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z738"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("gift_give" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z739"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grlfrd_kiss_01" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z740"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grlfrd_kiss_02" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z741"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grlfrd_kiss_03" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z742"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("playa_kiss_01" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z743"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("playa_kiss_02" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z744"
            GOSUB kissing_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("playa_kiss_03" "KISSING") (framedelta loop lockX lockY lockF) time
            GOSUB kissing_anims_unload
        ELSE
        IF TEST_CHEAT "Z745"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kill_knife_ped_damage" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z746"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kill_knife_ped_die" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z747"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kill_knife_player" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z748"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kill_partial" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z749"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_1" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z750"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_2" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z751"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_3" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z752"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_4" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z753"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_block" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z754"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_g" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z755"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_hit_1" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z756"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_hit_2" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z757"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_hit_3" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z758"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_idle" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z759"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("knife_part" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z760"
            GOSUB knife_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("weapon_knifeidle" "KNIFE") (framedelta loop lockX lockY lockF) time
            GOSUB knife_anims_unload
        ELSE
        IF TEST_CHEAT "Z761"
            GOSUB lapdan1_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_d" "LAPDAN1") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan1_anims_unload
        ELSE
        IF TEST_CHEAT "Z762"
            GOSUB lapdan1_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_p" "LAPDAN1") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan1_anims_unload
        ELSE
        IF TEST_CHEAT "Z763"
            GOSUB lapdan2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_d" "LAPDAN2") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan2_anims_unload
        ELSE
        IF TEST_CHEAT "Z764"
            GOSUB lapdan2_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_p" "LAPDAN2") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan2_anims_unload
        ELSE
        IF TEST_CHEAT "Z765"
            GOSUB lapdan3_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_d" "LAPDAN3") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan3_anims_unload
        ELSE
        IF TEST_CHEAT "Z766"
            GOSUB lapdan3_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lapdan_p" "LAPDAN3") (framedelta loop lockX lockY lockF) time
            GOSUB lapdan3_anims_unload
        ELSE
        IF TEST_CHEAT "Z767"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("f_smklean_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z768"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_bdbnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z769"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_hair" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z770"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_hurry" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z771"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_idleloop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z772"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_idle_to_l0" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z773"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l0_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z774"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l0_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z775"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l0_to_l1" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z776"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l12_to_l0" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z777"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l1_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z778"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l1_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z779"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l1_to_l2" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z780"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l2_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z781"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l2_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z782"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l2_to_l3" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z783"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l345_to_l1" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z784"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l3_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z785"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l3_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z786"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l3_to_l4" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z787"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l4_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z788"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l4_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z789"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l4_to_l5" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z790"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l5_bnce" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z791"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lrgirl_l5_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z792"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smklean_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z793"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("m_smkstnd_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z794"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkb" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z795"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkc" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z796"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkd" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z797"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlke" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z798"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkf" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z799"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkg" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z800"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("prtial_gngtlkh" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z7801"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_a_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z802"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_b_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z803"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("rap_c_loop" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z804"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("sit_relaxed" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z805"
            GOSUB lowrider_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tap_hand" "LOWRIDER") (framedelta loop lockX lockY lockF) time
            GOSUB lowrider_anims_unload
        ELSE
        IF TEST_CHEAT "Z806"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carhit_hangon" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z807"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("carhit_tumble" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z808"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("donutdrop" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z809"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_l1" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z810"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_l2" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z811"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_l3" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z812"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_r1" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z813"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_r2" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z814"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fen_choppa_r3" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z815"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hangon_stun_loop" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z816"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hangon_stun_turn" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z817"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_2_hang" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z818"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_jmp_bl" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z819"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_jmp_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z820"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_bl" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z821"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_die_bl" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z822"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_die_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z823"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z824"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_roll" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z825"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_lnd_roll_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z826"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_punch" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z827"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_punch_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z828"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_bike_shot_f" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z829"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_hang_lnd_roll" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z830"
            GOSUB mdchase_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("md_hang_loop" "MD_CHASE") (framedelta loop lockX lockY lockF) time
            GOSUB mdchase_anims_unload
        ELSE
        IF TEST_CHEAT "Z831"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc1_ply" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z832"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc1_ryd" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z833"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc1_smo" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z834"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc1_swe" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z835"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc2_ply" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z836"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc2_ryd" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z837"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc2_smo" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z838"
            GOSUB mdend_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("end_sc2_swe" "MD_END") (framedelta loop lockX lockY lockF) time
            GOSUB mdend_anims_unload
        ELSE
        IF TEST_CHEAT "Z839"
            GOSUB medic_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("cpr" "MEDIC") (framedelta loop lockX lockY lockF) time
            GOSUB medic_anims_unload
        ELSE
        IF TEST_CHEAT "Z840"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bitchslap" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z841"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_celebrate" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z842"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_comeon" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z843"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_idleloop_01" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z844"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_idleloop_02" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z845"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkleft_in" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z846"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkleft_loop" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z847"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkleft_out" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z848"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkright_in" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z849"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkright_loop" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z850"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bmx_talkright_out" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z851"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bng_wndw" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z852"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("bng_wndw_02" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z853"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("case_pickup" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z854"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("door_jet" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z855"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grab_l" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z856"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("grab_r" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z857"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hiker_pose" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z858"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("hiker_pose_l" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z859"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("idle_chat_02" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z860"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kat_throw_k" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z861"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kat_throw_o" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z862"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("kat_throw_p" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z863"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_rifle_o" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z864"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_rifle_ped" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z865"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pass_rifle_ply" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z866"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pickup_box" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z867"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_door" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z868"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_exit" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z869"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plane_hijack" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z870"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plunger_01" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z871"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyrlean_loop" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z872"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("plyr_shkhead" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z873"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("run_dive" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z874"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("scratchballs_01" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z875"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_lr" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z876"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_talk_01" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z877"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_talk_02" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z878"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("seat_watch" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z879"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smalplane_door" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z880"
            GOSUB misc_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("smlplane_door" "MISC") (framedelta loop lockX lockY lockF) time
            GOSUB misc_anims_unload
        ELSE
        IF TEST_CHEAT "Z881"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_back" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z882"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_bunnyhop" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z883"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_drivebyft" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z884"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_driveby_lhs" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z885"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_driveby_rhs" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z886"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_fwd" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z887"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_getoffback" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z888"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_getofflhs" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z889"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_getoffrhs" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z890"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_jumponl" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z891"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_jumponr" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z892"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_left" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z893"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_pedal" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z894"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_pushes" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z895"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_ride" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z896"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_right" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z897"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_sprint" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z898"
            GOSUB mtb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mtb_still" "MTB") (framedelta loop lockX lockY lockF) time
            GOSUB mtb_anims_unload
        ELSE
        IF TEST_CHEAT "Z899"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("msclewalkst_armed" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z900"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("msclewalkst_csaw" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z901"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mscle_rckt_run" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z902"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mscle_rckt_walkst" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z903"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("mscle_run_csaw" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z904"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("muscleidle" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z905"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("muscleidle_armed" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z906"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("muscleidle_csaw" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z907"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("muscleidle_rocket" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z908"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclerun" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z909"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclerun_armed" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z910"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclesprint" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z911"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclewalk" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z912"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclewalkstart" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z913"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclewalk_armed" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z914"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclewalk_csaw" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z915"
            GOSUB muscular_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("musclewalk_rocket" "MUSCULAR") (framedelta loop lockX lockY lockF) time
            GOSUB muscular_anims_unload
        ELSE
        IF TEST_CHEAT "Z916"
            GOSUB nevada_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("nevada_getin" "NEVADA") (framedelta loop lockX lockY lockF) time
            GOSUB nevada_anims_unload
        ELSE
        IF TEST_CHEAT "Z917"
            GOSUB nevada_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("nevada_getout" "NEVADA") (framedelta loop lockX lockY lockF) time
            GOSUB nevada_anims_unload
        ELSE
        IF TEST_CHEAT "Z918"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkaround_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z919"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkaround_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z920"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkaround_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z921"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkup_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z922"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkup_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z923"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkup_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z924"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("lkup_point" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z925"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_cower" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z926"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_hide" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z927"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z928"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z929"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z930"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_point" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z931"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("panic_shout" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z932"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pointup_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z933"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pointup_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z934"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pointup_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z935"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pointup_shout" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z936"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("point_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z937"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("point_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z938"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("point_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z939"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shout_01" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z940"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shout_02" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z941"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shout_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z942"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shout_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z943"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("shout_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z944"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wave_in" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z945"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wave_loop" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z946"
            GOSUB onlookers_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wave_out" "ON_LOOKERS") (framedelta loop lockX lockY lockF) time
            GOSUB onlookers_anims_unload
        ELSE
        IF TEST_CHEAT "Z947"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("betslp_in" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z948"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("betslp_lkabt" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z949"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("betslp_loop" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z950"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("betslp_out" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z951"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("betslp_tnk" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z952"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_cmon" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z953"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_in" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z954"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_loop" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z955"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_lose" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z956"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_out" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z957"
            GOSUB otb_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wtchrace_win" "OTB") (framedelta loop lockX lockY lockF) time
            GOSUB otb_anims_unload
        ELSE
        IF TEST_CHEAT "Z958"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z959"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive_accel" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z960"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive_die" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z961"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive_l" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z962"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("fall_skydive_r" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z963"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_decel" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z964"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_decel_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z965"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_float" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z966"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_float_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z967"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_land" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z968"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_land_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z969"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_land_water" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z970"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_land_water_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z971"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_open" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z972"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_open_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z973"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_rip_land_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z974"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_rip_loop_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z975"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_rip_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z976"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_steerl" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z977"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_steerl_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z978"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_steerr" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z979"
            GOSUB parachute_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("para_steerr_o" "PARACHUTE") (framedelta loop lockX lockY lockF) time
            GOSUB parachute_anims_unload
        ELSE
        IF TEST_CHEAT "Z980"
            GOSUB park_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tai_chi_in" "PARK") (framedelta loop lockX lockY lockF) time
            GOSUB park_anims_unload
        ELSE
        IF TEST_CHEAT "Z981"
            GOSUB park_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tai_chi_loop" "PARK") (framedelta loop lockX lockY lockF) time
            GOSUB park_anims_unload
        ELSE
        IF TEST_CHEAT "Z982"
            GOSUB park_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("tai_chi_out" "PARK") (framedelta loop lockX lockY lockF) time
            GOSUB park_anims_unload
        ELSE
        IF TEST_CHEAT "Z983"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piss_in" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z984"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piss_loop" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z985"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("piss_out" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z986"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_argue1_a" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z987"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_argue1_b" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z988"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_argue2_a" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z989"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_argue2_b" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z990"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_loop_a" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z991"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("pnm_loop_b" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z992"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wank_in" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z993"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wank_loop" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ELSE
        IF TEST_CHEAT "Z994"
            GOSUB paulnmac_anims_load
            TASK_PLAY_ANIM_NON_INTERRUPTABLE scplayer ("wank_out" "PAULNMAC") (framedelta loop lockX lockY lockF) time
            GOSUB paulnmac_anims_unload
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
        ENDIF
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

    airport_anims_load:
        REQUEST_ANIMATION AIRPORT
        WHILE NOT HAS_ANIMATION_LOADED AIRPORT
            WAIT 0
        ENDWHILE
        RETURN

    attractors_anims_load:
        REQUEST_ANIMATION ATTRACTORS
        WHILE NOT HAS_ANIMATION_LOADED ATTRACTORS
            WAIT 0
        ENDWHILE
        RETURN

    bar_anims_load:
        REQUEST_ANIMATION BAR
        WHILE NOT HAS_ANIMATION_LOADED BAR
            WAIT 0
        ENDWHILE
        RETURN

    baseball_anims_load:
        REQUEST_ANIMATION BASEBALL
        WHILE NOT HAS_ANIMATION_LOADED BASEBALL
            WAIT 0
        ENDWHILE
        RETURN

    bdfire_anims_load:
        REQUEST_ANIMATION BD_FIRE
        WHILE NOT HAS_ANIMATION_LOADED BD_FIRE
            WAIT 0
        ENDWHILE
        RETURN

    beach_anims_load:
        REQUEST_ANIMATION BEACH
        WHILE NOT HAS_ANIMATION_LOADED BEACH
            WAIT 0
        ENDWHILE
        RETURN

    benchpress_anims_load:
        REQUEST_ANIMATION BENCHPRESS
        WHILE NOT HAS_ANIMATION_LOADED BENCHPRESS
            WAIT 0
        ENDWHILE
        RETURN

    bfinjection_anims_load:
        REQUEST_ANIMATION BF_INJECTION
        WHILE NOT HAS_ANIMATION_LOADED BF_INJECTION
            WAIT 0
        ENDWHILE
        RETURN

    biked_anims_load:
        REQUEST_ANIMATION BIKED
        WHILE NOT HAS_ANIMATION_LOADED BIKED
            WAIT 0
        ENDWHILE
        RETURN

    bikeh_anims_load:
        REQUEST_ANIMATION BIKEH
        WHILE NOT HAS_ANIMATION_LOADED BIKEH
            WAIT 0
        ENDWHILE
        RETURN

    bikeleap_anims_load:
        REQUEST_ANIMATION BIKELEAP
        WHILE NOT HAS_ANIMATION_LOADED BIKELEAP
            WAIT 0
        ENDWHILE
        RETURN

    bikes_anims_load:
        REQUEST_ANIMATION BIKES
        WHILE NOT HAS_ANIMATION_LOADED BIKES
            WAIT 0
        ENDWHILE
        RETURN

    bikev_anims_load:
        REQUEST_ANIMATION BIKEV
        WHILE NOT HAS_ANIMATION_LOADED BIKEV
            WAIT 0
        ENDWHILE
        RETURN

    bikedbz_anims_load:
        REQUEST_ANIMATION BIKE_DBZ
        WHILE NOT HAS_ANIMATION_LOADED BIKE_DBZ
            WAIT 0
        ENDWHILE
        RETURN

    bmx_anims_load:
        REQUEST_ANIMATION BMX
        WHILE NOT HAS_ANIMATION_LOADED BMX
            WAIT 0
        ENDWHILE
        RETURN

    bomber_anims_load:
        REQUEST_ANIMATION BOMBER
        WHILE NOT HAS_ANIMATION_LOADED BOMBER
            WAIT 0
        ENDWHILE
        RETURN

    box_anims_load:
        REQUEST_ANIMATION BOX
        WHILE NOT HAS_ANIMATION_LOADED BOX
            WAIT 0
        ENDWHILE
        RETURN

    bsktball_anims_load:
        REQUEST_ANIMATION BSKTBALL
        WHILE NOT HAS_ANIMATION_LOADED BSKTBALL
            WAIT 0
        ENDWHILE
        RETURN

    buddy_anims_load:
        REQUEST_ANIMATION BUDDY
        WHILE NOT HAS_ANIMATION_LOADED BUDDY
            WAIT 0
        ENDWHILE
        RETURN

    bus_anims_load:
        REQUEST_ANIMATION BUS
        WHILE NOT HAS_ANIMATION_LOADED BUS
            WAIT 0
        ENDWHILE
        RETURN

    camera_anims_load:
        REQUEST_ANIMATION CAMERA
        WHILE NOT HAS_ANIMATION_LOADED CAMERA
            WAIT 0
        ENDWHILE
        RETURN

    car_anims_load:
        REQUEST_ANIMATION CAR
        WHILE NOT HAS_ANIMATION_LOADED CAR
            WAIT 0
        ENDWHILE
        RETURN

    carry_anims_load:
        REQUEST_ANIMATION CARRY
        WHILE NOT HAS_ANIMATION_LOADED CARRY
            WAIT 0
        ENDWHILE
        RETURN

    carchat_anims_load:
        REQUEST_ANIMATION CAR_CHAT
        WHILE NOT HAS_ANIMATION_LOADED CAR_CHAT
            WAIT 0
        ENDWHILE
        RETURN

    casino_anims_load:
        REQUEST_ANIMATION CASINO
        WHILE NOT HAS_ANIMATION_LOADED CASINO
            WAIT 0
        ENDWHILE
        RETURN

    chainsaw_anims_load:
        REQUEST_ANIMATION CHAINSAW
        WHILE NOT HAS_ANIMATION_LOADED CHAINSAW
            WAIT 0
        ENDWHILE
        RETURN

    choppa_anims_load:
        REQUEST_ANIMATION CHOPPA
        WHILE NOT HAS_ANIMATION_LOADED CHOPPA
            WAIT 0
        ENDWHILE
        RETURN

    clothes_anims_load:
        REQUEST_ANIMATION CLOTHES
        WHILE NOT HAS_ANIMATION_LOADED CLOTHES
            WAIT 0
        ENDWHILE
        RETURN

    coach_anims_load:
        REQUEST_ANIMATION COACH
        WHILE NOT HAS_ANIMATION_LOADED COACH
            WAIT 0
        ENDWHILE
        RETURN

    colt45_anims_load:
        REQUEST_ANIMATION COLT45
        WHILE NOT HAS_ANIMATION_LOADED COLT45
            WAIT 0
        ENDWHILE
        RETURN

    copambient_anims_load:
        REQUEST_ANIMATION COP_AMBIENT
        WHILE NOT HAS_ANIMATION_LOADED COP_AMBIENT
            WAIT 0
        ENDWHILE
        RETURN

    copdvbyz_anims_load:
        REQUEST_ANIMATION COP_DVBYZ
        WHILE NOT HAS_ANIMATION_LOADED COP_DVBYZ
            WAIT 0
        ENDWHILE
        RETURN

    crack_anims_load:
        REQUEST_ANIMATION CRACK
        WHILE NOT HAS_ANIMATION_LOADED CRACK
            WAIT 0
        ENDWHILE
        RETURN

    crib_anims_load:
        REQUEST_ANIMATION CRIB
        WHILE NOT HAS_ANIMATION_LOADED CRIB
            WAIT 0
        ENDWHILE
        RETURN

    damjump_anims_load:
        REQUEST_ANIMATION DAM_JUMP
        WHILE NOT HAS_ANIMATION_LOADED DAM_JUMP
            WAIT 0
        ENDWHILE
        RETURN

    dancing_anims_load:
        REQUEST_ANIMATION DANCING
        WHILE NOT HAS_ANIMATION_LOADED DANCING
            WAIT 0
        ENDWHILE
        RETURN

    dealer_anims_load:
        REQUEST_ANIMATION DEALER
        WHILE NOT HAS_ANIMATION_LOADED DEALER
            WAIT 0
        ENDWHILE
        RETURN

    dildo_anims_load:
        REQUEST_ANIMATION DILDO
        WHILE NOT HAS_ANIMATION_LOADED DILDO
            WAIT 0
        ENDWHILE
        RETURN

    dodge_anims_load:
        REQUEST_ANIMATION DODGE
        WHILE NOT HAS_ANIMATION_LOADED DODGE
            WAIT 0
        ENDWHILE
        RETURN

    dozer_anims_load:
        REQUEST_ANIMATION DOZER
        WHILE NOT HAS_ANIMATION_LOADED DOZER
            WAIT 0
        ENDWHILE
        RETURN

    drivebys_anims_load:
        REQUEST_ANIMATION DRIVEBYS
        WHILE NOT HAS_ANIMATION_LOADED DRIVEBYS
            WAIT 0
        ENDWHILE
        RETURN

    fat_anims_load:
        REQUEST_ANIMATION FAT
        WHILE NOT HAS_ANIMATION_LOADED FAT
            WAIT 0
        ENDWHILE
        RETURN

    fightb_anims_load:
        REQUEST_ANIMATION FIGHT_B
        WHILE NOT HAS_ANIMATION_LOADED FIGHT_B
            WAIT 0
        ENDWHILE
        RETURN

    fightc_anims_load:
        REQUEST_ANIMATION FIGHT_C
        WHILE NOT HAS_ANIMATION_LOADED FIGHT_C
            WAIT 0
        ENDWHILE
        RETURN

    fightd_anims_load:
        REQUEST_ANIMATION FIGHT_D
        WHILE NOT HAS_ANIMATION_LOADED FIGHT_D
            WAIT 0
        ENDWHILE
        RETURN

    fighte_anims_load:
        REQUEST_ANIMATION FIGHT_E
        WHILE NOT HAS_ANIMATION_LOADED FIGHT_E
            WAIT 0
        ENDWHILE
        RETURN

    finale_anims_load:
        REQUEST_ANIMATION FINALE
        WHILE NOT HAS_ANIMATION_LOADED FINALE
            WAIT 0
        ENDWHILE
        RETURN

    finale2_anims_load:
        REQUEST_ANIMATION FINALE2
        WHILE NOT HAS_ANIMATION_LOADED FINALE2
            WAIT 0
        ENDWHILE
        RETURN

    flame_anims_load:
        REQUEST_ANIMATION FLAME
        WHILE NOT HAS_ANIMATION_LOADED FLAME
            WAIT 0
        ENDWHILE
        RETURN

    flowers_anims_load:
        REQUEST_ANIMATION FLOWERS
        WHILE NOT HAS_ANIMATION_LOADED FLOWERS
            WAIT 0
        ENDWHILE
        RETURN

    food_anims_load:
        REQUEST_ANIMATION FOOD
        WHILE NOT HAS_ANIMATION_LOADED FOOD
            WAIT 0
        ENDWHILE
        RETURN

    freeweights_anims_load:
        REQUEST_ANIMATION FREEWEIGHTS
        WHILE NOT HAS_ANIMATION_LOADED FREEWEIGHTS
            WAIT 0
        ENDWHILE
        RETURN

    gangs_anims_load:
        REQUEST_ANIMATION GANGS
        WHILE NOT HAS_ANIMATION_LOADED GANGS
            WAIT 0
        ENDWHILE
        RETURN

    ghands_anims_load:
        REQUEST_ANIMATION GHANDS
        WHILE NOT HAS_ANIMATION_LOADED GHANDS
            WAIT 0
        ENDWHILE
        RETURN

    ghettodb_anims_load:
        REQUEST_ANIMATION GHETTO_DB
        WHILE NOT HAS_ANIMATION_LOADED GHETTO_DB
            WAIT 0
        ENDWHILE
        RETURN

    goggles_anims_load:
        REQUEST_ANIMATION GOGGLES
        WHILE NOT HAS_ANIMATION_LOADED GOGGLES
            WAIT 0
        ENDWHILE
        RETURN

    graffiti_anims_load:
        REQUEST_ANIMATION GRAFFITI
        WHILE NOT HAS_ANIMATION_LOADED GRAFFITI
            WAIT 0
        ENDWHILE
        RETURN

    graveyard_anims_load:
        REQUEST_ANIMATION GRAVEYARD
        WHILE NOT HAS_ANIMATION_LOADED GRAVEYARD
            WAIT 0
        ENDWHILE
        RETURN

    grenade_anims_load:
        REQUEST_ANIMATION GRENADE
        WHILE NOT HAS_ANIMATION_LOADED GRENADE
            WAIT 0
        ENDWHILE
        RETURN

    gymnasium_anims_load:
        REQUEST_ANIMATION GYMNASIUM
        WHILE NOT HAS_ANIMATION_LOADED GYMNASIUM
            WAIT 0
        ENDWHILE
        RETURN

    haircuts_anims_load:
        REQUEST_ANIMATION HAIRCUTS
        WHILE NOT HAS_ANIMATION_LOADED HAIRCUTS
            WAIT 0
        ENDWHILE
        RETURN

    heist9_anims_load:
        REQUEST_ANIMATION HEIST9
        WHILE NOT HAS_ANIMATION_LOADED HEIST9
            WAIT 0
        ENDWHILE
        RETURN

    inthouse_anims_load:
        REQUEST_ANIMATION INT_HOUSE
        WHILE NOT HAS_ANIMATION_LOADED INT_HOUSE
            WAIT 0
        ENDWHILE
        RETURN

    intoffice_anims_load:
        REQUEST_ANIMATION INT_OFFICE
        WHILE NOT HAS_ANIMATION_LOADED INT_OFFICE
            WAIT 0
        ENDWHILE
        RETURN

    intshop_anims_load:
        REQUEST_ANIMATION INT_SHOP
        WHILE NOT HAS_ANIMATION_LOADED INT_SHOP
            WAIT 0
        ENDWHILE
        RETURN

    jstbuisness_anims_load:
        REQUEST_ANIMATION JST_BUISNESS
        WHILE NOT HAS_ANIMATION_LOADED JST_BUISNESS
            WAIT 0
        ENDWHILE
        RETURN

    kart_anims_load:
        REQUEST_ANIMATION KART
        WHILE NOT HAS_ANIMATION_LOADED KART
            WAIT 0
        ENDWHILE
        RETURN

    kissing_anims_load:
        REQUEST_ANIMATION KISSING
        WHILE NOT HAS_ANIMATION_LOADED KISSING
            WAIT 0
        ENDWHILE
        RETURN

    knife_anims_load:
        REQUEST_ANIMATION KNIFE
        WHILE NOT HAS_ANIMATION_LOADED KNIFE
            WAIT 0
        ENDWHILE
        RETURN

    lapdan1_anims_load:
        REQUEST_ANIMATION LAPDAN1
        WHILE NOT HAS_ANIMATION_LOADED LAPDAN1
            WAIT 0
        ENDWHILE
        RETURN

    lapdan2_anims_load:
        REQUEST_ANIMATION LAPDAN2
        WHILE NOT HAS_ANIMATION_LOADED LAPDAN2
            WAIT 0
        ENDWHILE
        RETURN

    lapdan3_anims_load:
        REQUEST_ANIMATION LAPDAN3
        WHILE NOT HAS_ANIMATION_LOADED LAPDAN3
            WAIT 0
        ENDWHILE
        RETURN

    lowrider_anims_load:
        REQUEST_ANIMATION LOWRIDER
        WHILE NOT HAS_ANIMATION_LOADED LOWRIDER
            WAIT 0
        ENDWHILE
        RETURN

    mdchase_anims_load:
        REQUEST_ANIMATION MD_CHASE
        WHILE NOT HAS_ANIMATION_LOADED MD_CHASE
            WAIT 0
        ENDWHILE
        RETURN

    mdend_anims_load:
        REQUEST_ANIMATION MD_END
        WHILE NOT HAS_ANIMATION_LOADED MD_END
            WAIT 0
        ENDWHILE
        RETURN

    medic_anims_load:
        REQUEST_ANIMATION MEDIC
        WHILE NOT HAS_ANIMATION_LOADED MEDIC
            WAIT 0
        ENDWHILE
        RETURN

    misc_anims_load:
        REQUEST_ANIMATION MISC
        WHILE NOT HAS_ANIMATION_LOADED MISC
            WAIT 0
        ENDWHILE
        RETURN

    mtb_anims_load:
        REQUEST_ANIMATION MTB
        WHILE NOT HAS_ANIMATION_LOADED MTB
            WAIT 0
        ENDWHILE
        RETURN

    muscular_anims_load:
        REQUEST_ANIMATION MUSCULAR
        WHILE NOT HAS_ANIMATION_LOADED MUSCULAR
            WAIT 0
        ENDWHILE
        RETURN

    nevada_anims_load:
        REQUEST_ANIMATION NEVADA
        WHILE NOT HAS_ANIMATION_LOADED NEVADA
            WAIT 0
        ENDWHILE
        RETURN

    onlookers_anims_load:
        REQUEST_ANIMATION ON_LOOKERS
        WHILE NOT HAS_ANIMATION_LOADED ON_LOOKERS
            WAIT 0
        ENDWHILE
        RETURN

    otb_anims_load:
        REQUEST_ANIMATION OTB
        WHILE NOT HAS_ANIMATION_LOADED OTB
            WAIT 0
        ENDWHILE
        RETURN

    parachute_anims_load:
        REQUEST_ANIMATION PARACHUTE
        WHILE NOT HAS_ANIMATION_LOADED PARACHUTE
            WAIT 0
        ENDWHILE
        RETURN

    park_anims_load:
        REQUEST_ANIMATION PARK
        WHILE NOT HAS_ANIMATION_LOADED PARK
            WAIT 0
        ENDWHILE
        RETURN

    paulnmac_anims_load:
        REQUEST_ANIMATION PAULNMAC
        WHILE NOT HAS_ANIMATION_LOADED PAULNMAC
            WAIT 0
        ENDWHILE
        RETURN

    airport_anims_unload:
        REMOVE_ANIMATION AIRPORT
        RETURN

    attractors_anims_unload:
        REMOVE_ANIMATION ATTRACTORS
        RETURN

    bar_anims_unload:
        REMOVE_ANIMATION BAR
        RETURN

    baseball_anims_unload:
        REMOVE_ANIMATION BASEBALL
        RETURN

    bdfire_anims_unload:
        REMOVE_ANIMATION BD_FIRE
        RETURN

    beach_anims_unload:
        REMOVE_ANIMATION BEACH
        RETURN

    benchpress_anims_unload:
        REMOVE_ANIMATION BENCHPRESS
        RETURN

    bfinjection_anims_unload:
        REMOVE_ANIMATION BF_INJECTION
        RETURN

    biked_anims_unload:
        REMOVE_ANIMATION BIKED
        RETURN

    bikeh_anims_unload:
        REMOVE_ANIMATION BIKEH
        RETURN

    bikeleap_anims_unload:
        REMOVE_ANIMATION BIKELEAP
        RETURN

    bikes_anims_unload:
        REMOVE_ANIMATION BIKES
        RETURN

    bikev_anims_unload:
        REMOVE_ANIMATION BIKEV
        RETURN

    bikedbz_anims_unload:
        REMOVE_ANIMATION BIKE_DBZ
        RETURN

    bmx_anims_unload:
        REMOVE_ANIMATION BMX
        RETURN

    bomber_anims_unload:
        REMOVE_ANIMATION BOMBER
        RETURN

    box_anims_unload:
        REMOVE_ANIMATION BOX
        RETURN

    bsktball_anims_unload:
        REMOVE_ANIMATION BSKTBALL
        RETURN

    buddy_anims_unload:
        REMOVE_ANIMATION BUDDY
        RETURN

    bus_anims_unload:
        REMOVE_ANIMATION BUS
        RETURN

    camera_anims_unload:
        REMOVE_ANIMATION CAMERA
        RETURN

    car_anims_unload:
        REMOVE_ANIMATION CAR
        RETURN

    carry_anims_unload:
        REMOVE_ANIMATION CARRY
        RETURN

    carchat_anims_unload:
        REMOVE_ANIMATION CAR_CHAT
        RETURN

    casino_anims_unload:
        REMOVE_ANIMATION CASINO
        RETURN

    chainsaw_anims_unload:
        REMOVE_ANIMATION CHAINSAW
        RETURN

    choppa_anims_unload:
        REMOVE_ANIMATION CHOPPA
        RETURN

    clothes_anims_unload:
        REMOVE_ANIMATION CLOTHES
        RETURN

    coach_anims_unload:
        REMOVE_ANIMATION COACH
        RETURN

    colt45_anims_unload:
        REMOVE_ANIMATION COLT45
        RETURN

    copambient_anims_unload:
        REMOVE_ANIMATION COP_AMBIENT
        RETURN

    copdvbyz_anims_unload:
        REMOVE_ANIMATION COP_DVBYZ
        RETURN

    crack_anims_unload:
        REMOVE_ANIMATION CRACK
        RETURN

    crib_anims_unload:
        REMOVE_ANIMATION CRIB
        RETURN

    damjump_anims_unload:
        REMOVE_ANIMATION DAM_JUMP
        RETURN

    dancing_anims_unload:
        REMOVE_ANIMATION DANCING
        RETURN

    dealer_anims_unload:
        REMOVE_ANIMATION DEALER
        RETURN

    dildo_anims_unload:
        REMOVE_ANIMATION DILDO
        RETURN

    dodge_anims_unload:
        REMOVE_ANIMATION DODGE
        RETURN

    dozer_anims_unload:
        REMOVE_ANIMATION DOZER
        RETURN

    drivebys_anims_unload:
        REMOVE_ANIMATION DRIVEBYS
        RETURN

    fat_anims_unload:
        REMOVE_ANIMATION FAT
        RETURN

    fightb_anims_unload:
        REMOVE_ANIMATION FIGHT_B
        RETURN

    fightc_anims_unload:
        REMOVE_ANIMATION FIGHT_C
        RETURN

    fightd_anims_unload:
        REMOVE_ANIMATION FIGHT_D
        RETURN

    fighte_anims_unload:
        REMOVE_ANIMATION FIGHT_E
        RETURN

    finale_anims_unload:
        REMOVE_ANIMATION FINALE
        RETURN

    finale2_anims_unload:
        REMOVE_ANIMATION FINALE2
        RETURN

    flame_anims_unload:
        REMOVE_ANIMATION FLAME
        RETURN

    flowers_anims_unload:
        REMOVE_ANIMATION FLOWERS
        RETURN

    food_anims_unload:
        REMOVE_ANIMATION FOOD
        RETURN

    freeweights_anims_unload:
        REMOVE_ANIMATION FREEWEIGHTS
        RETURN

    gangs_anims_unload:
        REMOVE_ANIMATION GANGS
        RETURN

    ghands_anims_unload:
        REMOVE_ANIMATION GHANDS
        RETURN

    ghettodb_anims_unload:
        REMOVE_ANIMATION GHETTO_DB
        RETURN

    goggles_anims_unload:
        REMOVE_ANIMATION GOGGLES
        RETURN

    graffiti_anims_unload:
        REMOVE_ANIMATION GRAFFITI
        RETURN

    graveyard_anims_unload:
        REMOVE_ANIMATION GRAVEYARD
        RETURN

    grenade_anims_unload:
        REMOVE_ANIMATION GRENADE
        RETURN

    gymnasium_anims_unload:
        REMOVE_ANIMATION GYMNASIUM
        RETURN

    haircuts_anims_unload:
        REMOVE_ANIMATION HAIRCUTS
        RETURN

    heist9_anims_unload:
        REMOVE_ANIMATION HEIST9
        RETURN

    inthouse_anims_unload:
        REMOVE_ANIMATION INT_HOUSE
        RETURN

    intoffice_anims_unload:
        REMOVE_ANIMATION INT_OFFICE
        RETURN

    intshop_anims_unload:
        REMOVE_ANIMATION INT_SHOP
        RETURN

    jstbuisness_anims_unload:
        REMOVE_ANIMATION JST_BUISNESS
        RETURN

    kart_anims_unload:
        REMOVE_ANIMATION KART
        RETURN

    kissing_anims_unload:
        REMOVE_ANIMATION KISSING
        RETURN

    knife_anims_unload:
        REMOVE_ANIMATION KNIFE
        RETURN

    lapdan1_anims_unload:
        REMOVE_ANIMATION LAPDAN1
        RETURN

    lapdan2_anims_unload:
        REMOVE_ANIMATION LAPDAN2
        RETURN

    lapdan3_anims_unload:
        REMOVE_ANIMATION LAPDAN3
        RETURN

    lowrider_anims_unload:
        REMOVE_ANIMATION LOWRIDER
        RETURN

    mdchase_anims_unload:
        REMOVE_ANIMATION MD_CHASE
        RETURN

    mdend_anims_unload:
        REMOVE_ANIMATION MD_END
        RETURN

    medic_anims_unload:
        REMOVE_ANIMATION MEDIC
        RETURN

    misc_anims_unload:
        REMOVE_ANIMATION MISC
        RETURN

    mtb_anims_unload:
        REMOVE_ANIMATION MTB
        RETURN

    muscular_anims_unload:
        REMOVE_ANIMATION MUSCULAR
        RETURN

    nevada_anims_unload:
        REMOVE_ANIMATION NEVADA
        RETURN

    onlookers_anims_unload:
        REMOVE_ANIMATION ON_LOOKERS
        RETURN

    otb_anims_unload:
        REMOVE_ANIMATION OTB
        RETURN

    parachute_anims_unload:
        REMOVE_ANIMATION PARACHUTE
        RETURN

    park_anims_unload:
        REMOVE_ANIMATION PARK
        RETURN

    paulnmac_anims_unload:
        REMOVE_ANIMATION PAULNMAC
        RETURN
}
SCRIPT_END