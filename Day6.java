import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
    public Day6(){}

    public static void marker() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input6"));
        //part1
        char [] code = new char[4];
        //part2
        //char [] code = new char[14];

        String input = "rgffbnnqvqhhmtmzzmmpmllcggsdswwvvwzzpptbppgngsnncwcnwcwnwgwrwrrnqnlqlccwggrcgrccjgcgwghgffjgjgrgmmsrrhchfcfdccjwwzdzcdcbcjjtfjjltlvvtstvttszsvsmmfccwcjwwzmzhhjvjpvjpppcwppdtdvtdvtvztzvzffdfqqgbgffrgrpgphhbcctssncsnncfcppvnpvnvfnfvnnfggtpplggwsggldllzvzrznncbbjpplbbrrnsrssmrsrhhmqmnqqhpqqnrqnrrtrnnrwrwhhpjhphlhvvgbgzztqtvvmssdshhqnhnjjvhjhqqbrqrrmrlrdllvrlvlccfvcffhfssgvsswhwqqfwfwhhcffjmmjrrbgrgjgrrvsrvvwmwsmmszzvmzvmmwmtthvvfbfllpjpwpwjpwpnpjpqqwtqtwwqpwqqrsqqcpqqssrgsrrjwwqmwmgwgrggmvmgmfgmffjfhjfjttcztccmtmmccnznhhcgcffmnfmmqjjhwwtccbzbhhwnhnsnmsnmnqqchhhnggbzbjzjzszsfsjfjvffnlffvrvddbhhqccdnnzwnznjnpnmppthhqddjhddqjqlqplqqjpjwppqttswsvwvfwflfplffnbfbwfwhhlhtlhtltzzmlmslmlwwgzwzrrwhhlnnrfnnmpppjpgpbbhpbhppbrppbhhzgzczqcqvqggwppcnnhnznvznzhhcpctptpjtppdhhprhrcrpcprpplrprzrnrfnrnlrlvrrfqqnnsqsqrssnrnvvvghvvbzzqppjsjnnrprwrrmqqtfqfwwrdrsddprddbdzbdbndbdjdljjrtjrrnzrzjrzzpssftfmfbflbbcpcsppwrppntnhthlthtbbsmsbmsmggpssnhnjjtsjjwssdjdwwppcbpcclmccwzzrggmgmnnwjnnqppjttvllmhhvcctptbpbdpdhdqqgggbnnqcchlhssltstllvqlvqvdvjdvvqvsvfvhfhlfftqffztzdttfvvzmvzznvnsnjjvqjvjljplpvvzlzhzghgddbbzbmbnztgthrnpsqhhdvprtpdftmqfvgjzgdvqwmvgwbczvbschqfhdvqcfnmbgmtqmlmsqcbfhshrzzbrtpgnwwtzgnjghzrlwhntprqhvshjcfvlnchccbtnswfnmpccdppqrqrhngvlwrpplbnpgzbzwtzwrsptmsmlndcfmbnqgvnqvzwpvrtfsrwfvfwdvplrfdddwcnwhzchmwfjsfvbtbrjchmgqwfvvmpzhqcbzhrcmjrzmgrtnzrcqdqdqnpwjctlhrjcphbbcvhvqnhtwjrvrbzfzfzzplshvrcchvtgtjcnhlzsttwdhcmdvrdlgsngvtzqsjrcptwwbgvfbsvgnmfhmvgqtfzbhhmdznjlsghhnlwzhvplfvlqzbrsjhdvrshjbnfqgpscbpzmnmmcsdbtwbwmsvfjwdvtctslcqfssrhczdptlrjbfzjctqrcbppcfcbqqzhhftdjchtscwgwcnpvrrjvnnwrqtrqmbgdfcpqhddnvdnmlmqcgsndwbcfvfrzsrflsnqrpmszqrdlshlcsfrmnsqmtrvjwqcllftscwrtmvcjsmrlqvdfjzgfdtswqzldqgjvhczpqrfbclnbwcjprjncvhgfmjhgfgnvfzfnvbbstgsgtspdhtfsncttlwmllbbvqftjtshfjlqtjwlvrbwmzfhdmcbhtqdzqtzmdljqprwhqwcvbtfqbpjwztgqrvlrqdwmqrqzvptsgjdqnqdfwfpjdglwgpdrcfrrzmpjmtbwwrqqcsnmphcqtthlnlzlfftrjmtjwwqrldcfjjclzrsqvltsfchfggcwbzbtpqcjfvgpwnwwqrdbdvjplgsgctdhqvttmtpmmjfcqdslhjgtdppbmzbrfbrrjncfdhlmjgdwjrmbgpcgctghbvphpgfvvfvtplqrhnjjhqntjvbsggvrvjgrwptcgqgrmjtprvhnvjsdsfqrqrrltlhvfsjsqpbwndbsnjzplcfqtfbdqdzdvnljcsmjnrmwwjzqwsjbdlclsmccbqwnlpltqhqhmthhrdjwlqwrbltghsvblqntvjqzpmmpqwrrwvhmtfqzhrmjfglwfpthhgbhdmrtprtqgqbdcfqlbbvmzmchzglmpzdvhpqchhclbcvrcmhtzqfzrplbvmdhghsttzgdjbgmmtvlqjsstgwlwchhwmflwbgljgszghvfdsngbtbcnhzmmdmsjqfbcsmgpjwjqgwqdlrgznnmhphbrzcgnqczpcbljjmhnnrmzlpqbswwcjpjqcrtdmgprpmmbprwlmpzcmwlnbzqjsgftrncvmjmjwvqgszsrmrczhjnwlghgndhbthwlhfbncrwqfgnshrmdfhwmfvllhvbmmllwfbgrnrttpzffzvcfjfbrmdqfcfrdqsltpbbttnqnbncfhwghfbgwrltbhwmmlpczsvvdnwhchgfplnjsttsqvsznwvlwzgfnhfrrgplsfwrwnbfhblwtjpldjmzrglhppgsjsgzssbbgrrbdmpwhgjjmlfnpdbvtntcwrvltgfnrgwttvvjhqljjvvnmztwgzcclgbjnjspzwnpgtgvhhhqbzrnvmdcljcdncvpnpdhrhqwvlhllbsrmjbzlgczwjsrvqrqfqmtjrnpbtdhsrfbhrgtgnrmlgcwcmrvrdfcqbfcqczjchgrjpzqfqqmcpvnvbrssfrfsrjmlngplqqsnclgvpfhjbzdppjftlgbmcgdbrvqrclvtdnzhhcmzlrdrgbrqrlvfcnvznnqwswvhdpbbjmsqzcrmjngzmdftjzsjvgfdtcvdwhnwwjlcgcmflzzpzpgzrvmptbjgrdjbzscrglhcjppdjdshnvvbsnnddtbwsdrpnbnlrtppcrzbbjrfzhbwgmjqtmgjvmrjgfdndlmqvhgwprsjnhcmrnfdfdzggjjzcccnsnwwbjzmsfjjfhclptfcwqjhnphpwzszjmsrtnbqpqsvcfcvrrgclwlbrqngdcdlzrdfpvbgtznjzdvjngrgswhjnrpgswtqflpgvnpbsvcrtgtzcbhdjpbjwnpdzcmprtzlppbqvpzrrlbssmwhhvqqpmwggnzwcfdnzccjrrncnvjqgbpstctwpqvhdsbcsjrpbzbdlwwvjngtbnvpthppglgsnrbwnvpzldhsgwqhclgwrdsvcfdclvdsbrhcfnbgrtqswstnjfmfrdgphpvgjfqzcwnpcghdhtflgdnhhnnnwrpnmppszgqdcqjqpnccfsqjsmwtqvzwfqvtwtthwswmcqqcqjwcgwgzgmnpzbfpzrqbvqhbhtsvvbppbmqzfnsmwppzvsctgcncztsqdfhnlwjjtvwcchvnphwpnpzqsjhlrcmnbthtqlfclnsfdtpwfzljdpfszvhgzdpzhbjtphbfbmwgfrfplntfqhgpbjzghmblzzhdcbptngqwrtfmvtbhphpvdwpswbscrwzhnvqfwlbwwqqgstgmbqlllspbhbpjmmrfhmjwzdnsdwmpvlrspgzmdjwqwcjpbgwspsghjdvrbbsbtgwptqdvvdhbhqbdhpbzdsdwsjdbjnztdqqrdhwhtpvcbblbmjgmbpqghdsfthzjffrdvldfsnpcsmnzwzcqlnvcrcbqnfcdrfbffrvhqsbqjnnbzsqvqqdqwmsvbqvtgmnnlthpngfsljqnrdhhzpmwsnqvrgdnvlbgnndfcpjfgmzqssvnnrwbmslcqpnhnnwzggsjvqcsqpfzjcmcppntmsdtfggzdncqbfjsqvbzgnnlsdbgjqffsmvnbqlsrjwdmcjbrsrpchnnhdtlcdhfdltmlvtrwjpzphtbhzzrlrwbbhhpntgbcfmphnbrjdhrhvmvhfglrncngjdsvbfrqtqzsgvlzjqzcqnwdcfgvnpsqpphwfsdvpgnchjnnjhsqgvlqcvhzzzcrsqcvrbsbjbdbgddlbb";
        int pos = 0;
        boolean dupe = true;
        System.out.println(input.length());

        for(int g = 0; g < input.length();g++) {
            for (int i = 0; i < code.length; i++) {
                code[i] = input.charAt(pos);
                pos++;
            }
            for (int j = 0; j < code.length; j++) {
                for (int k = j + 1; k < code.length; k++) {
                    if(code[j]!=code[k])
                    {
                        dupe= false;
                    }
                    else
                    {
                        dupe = true;
                        break;
                    }
                }
                if(dupe)
                {
                    break;
                }
            }
            if (!dupe) {
                System.out.println("Marker ist an der Stelle " + pos);
                break;

            }
            //part1
            pos = pos-3;
            //part2
            //pos = pos- 13;
        }
        System.out.println(Arrays.toString(code));


    }
}
