// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct MovementEvent {
 *     MovementPhaseState_t eventState;
 *     struct TimeChangeDetails *timing;
 *     struct AdvisorySpeedList *speeds;
 *     struct MovementEvent__regional {
 *         struct {
 *             struct Reg_MovementEvent **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_MovementEvent *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * } MovementEvent_t
 * }
 */
public class MovementEvent_t extends MovementEvent {

    MovementEvent_t() {
        // Should not be called directly
    }
}

